package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.*;
import com.ruoyi.system.service.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品列表Controller
 * 
 * @author lrj
 * @date 2023-03-08
 */
@RestController
@RequestMapping("/system/product")
public class ProductController extends BaseController
{
    @Autowired
    private IProductService productService;

    @Autowired
    private ISysUserService userService;

    @Autowired
    private IBugService bugService;

    @Autowired
    private IProductPlanService productPlanService;

    @Autowired
    private IExecuteService executeService;

    @Autowired
    private ITaskService taskService;

    /**
     * 查询产品列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(Product product)
    {
        startPage();
        List<Product> list = productService.selectProductList(product);
        for (Product temp :
                list) {
            temp.setProductPrincipalName(userService.selectUserById(temp.getProductPrincipalId()).getNickName());
            temp.setTestPrincipalName(userService.selectUserById(temp.getTestPrincipalId()).getNickName());
            Bug bug = new Bug();
            bug.setProductId(temp.getProductId());
            temp.setProductBugNumber(bugService.selectBugList(bug).size());
            ProductPlan productPlan = new ProductPlan();
            productPlan.setProductId(temp.getProductId());
            temp.setProductPlanNumber(productPlanService.selectProductPlanList(productPlan).size());
            //完成率=完成的任务/总任务数
            double AllTask = 0;
            double AllFinishTask = 0;
            Execute execute = new Execute();
            execute.setRelatedProductId(temp.getProductId());
            List<Execute> executes = executeService.selectExecuteList(execute);
            for (Execute exTemp :
                    executes) {
                Task task = new Task();
                task.setExecuteId(exTemp.getExecuteId());
                List<Task> tasks = taskService.selectTaskList(task);
                for (Task taskTemp :
                        tasks) {
                    if (taskTemp.getTaskState() == 2) {
                        AllFinishTask +=1;
                    }
                    AllTask+=1;

                    }
            }
//            System.out.println("来到了这里");
//            System.out.println(AllTask);
//            System.out.println(AllFinishTask);
            if (AllTask!=0){
//                System.out.println("执行方法");
//                System.out.println(AllFinishTask/AllTask);
                temp.setProductRequireFinishRate((AllFinishTask/AllTask)*100);
            }
        }
        return getDataTable(list);
    }

    /**
     * 导出产品列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:product:export')")
    @Log(title = "产品列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Product product)
    {
        List<Product> list = productService.selectProductList(product);
        ExcelUtil<Product> util = new ExcelUtil<Product>(Product.class);
        util.exportExcel(response, list, "产品列表数据");
    }

    /**
     * 获取产品列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:product:query')")
    @GetMapping(value = "/{productId}")
    public AjaxResult getInfo(@PathVariable("productId") Long productId)
    {
        return success(productService.selectProductByProductId(productId));
    }

    /**
     * 新增产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:product:add')")
    @Log(title = "产品列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Product product)
    {
        return toAjax(productService.insertProduct(product));
    }

    /**
     * 修改产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:product:edit')")
    @Log(title = "产品列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Product product)
    {
        return toAjax(productService.updateProduct(product));
    }

    /**
     * 删除产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:product:remove')")
    @Log(title = "产品列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{productIds}")
    public AjaxResult remove(@PathVariable Long[] productIds)
    {
        return toAjax(productService.deleteProductByProductIds(productIds));
    }
}

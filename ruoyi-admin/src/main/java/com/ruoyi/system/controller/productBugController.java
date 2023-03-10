package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.Bug;
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
import com.ruoyi.system.domain.productBug;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品bug列表Controller
 * 
 * @author lrj
 * @date 2023-03-10
 */
@RestController
@RequestMapping("/system/productBug")
public class productBugController extends BaseController
{
    @Autowired
    private IproductBugService productBugService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IItemService itemService;

    @Autowired
    private IExecuteService executeService;

    @Autowired
    private ISysUserService userService;

    @Autowired
    private IProductRequirementService requirementService;

    @Autowired
    private ITaskService taskService;

    /**
     * 查询产品bug列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:productBug:list')")
    @GetMapping("/list")
    public TableDataInfo list(productBug productBug)
    {
        startPage();
        List<productBug> list = productBugService.selectproductBugList(productBug);
        for (productBug temp :
                list) {
            temp.setProductName(productService.selectProductByProductId(temp.getProductId()).getProductName());
            temp.setItemName(itemService.selectItemByItemId(temp.getItemId()).getItemName());
            temp.setExecuteName(executeService.selectExecuteByExecuteId(temp.getExecuteId()).getExecuteName());
            temp.setDesignateName(userService.selectUserById(temp.getDesignateId()).getNickName());
            temp.setRequireName(requirementService.selectProductRequirementByProductRequirementId(temp.getRelateNeedId()).getRequirementName());
            temp.setTaskName(taskService.selectTaskByTaskId(temp.getRelateTaskId()).getTaskName());
        }
        return getDataTable(list);
    }

    /**
     * 导出产品bug列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:productBug:export')")
    @Log(title = "产品bug列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, productBug productBug)
    {
        List<productBug> list = productBugService.selectproductBugList(productBug);
        ExcelUtil<productBug> util = new ExcelUtil<productBug>(productBug.class);
        util.exportExcel(response, list, "产品bug列表数据");
    }

    /**
     * 获取产品bug列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:productBug:query')")
    @GetMapping(value = "/{bugId}")
    public AjaxResult getInfo(@PathVariable("bugId") Long bugId)
    {
        return success(productBugService.selectproductBugByBugId(bugId));
    }

    /**
     * 新增产品bug列表
     */
    @PreAuthorize("@ss.hasPermi('system:productBug:add')")
    @Log(title = "产品bug列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody productBug productBug)
    {
        return toAjax(productBugService.insertproductBug(productBug));
    }

    /**
     * 修改产品bug列表
     */
    @PreAuthorize("@ss.hasPermi('system:productBug:edit')")
    @Log(title = "产品bug列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody productBug productBug)
    {
        return toAjax(productBugService.updateproductBug(productBug));
    }

    /**
     * 删除产品bug列表
     */
    @PreAuthorize("@ss.hasPermi('system:productBug:remove')")
    @Log(title = "产品bug列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bugIds}")
    public AjaxResult remove(@PathVariable Long[] bugIds)
    {
        return toAjax(productBugService.deleteproductBugByBugIds(bugIds));
    }
}

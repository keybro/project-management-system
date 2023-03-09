package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.IProductService;
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
import com.ruoyi.system.domain.ProductPlan;
import com.ruoyi.system.service.IProductPlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品计划列表Controller
 * 
 * @author lrj
 * @date 2023-03-08
 */
@RestController
@RequestMapping("/system/plan")
public class ProductPlanController extends BaseController
{
    @Autowired
    private IProductPlanService productPlanService;

    @Autowired
    private IProductService productService;

    /**
     * 查询产品计划列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProductPlan productPlan)
    {
        startPage();
        List<ProductPlan> list = productPlanService.selectProductPlanList(productPlan);
        for (ProductPlan temp :
                list) {
            temp.setProductName(productService.selectProductByProductId(temp.getProductId()).getProductName());
        }
        return getDataTable(list);
    }

    /**
     * 导出产品计划列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:plan:export')")
    @Log(title = "产品计划列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProductPlan productPlan)
    {
        List<ProductPlan> list = productPlanService.selectProductPlanList(productPlan);
        ExcelUtil<ProductPlan> util = new ExcelUtil<ProductPlan>(ProductPlan.class);
        util.exportExcel(response, list, "产品计划列表数据");
    }

    /**
     * 获取产品计划列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:plan:query')")
    @GetMapping(value = "/{panId}")
    public AjaxResult getInfo(@PathVariable("panId") Long panId)
    {
        return success(productPlanService.selectProductPlanByPanId(panId));
    }

    /**
     * 新增产品计划列表
     */
    @PreAuthorize("@ss.hasPermi('system:plan:add')")
    @Log(title = "产品计划列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProductPlan productPlan)
    {
        return toAjax(productPlanService.insertProductPlan(productPlan));
    }

    /**
     * 修改产品计划列表
     */
    @PreAuthorize("@ss.hasPermi('system:plan:edit')")
    @Log(title = "产品计划列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProductPlan productPlan)
    {
        return toAjax(productPlanService.updateProductPlan(productPlan));
    }

    /**
     * 删除产品计划列表
     */
    @PreAuthorize("@ss.hasPermi('system:plan:remove')")
    @Log(title = "产品计划列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{panIds}")
    public AjaxResult remove(@PathVariable Long[] panIds)
    {
        return toAjax(productPlanService.deleteProductPlanByPanIds(panIds));
    }
}

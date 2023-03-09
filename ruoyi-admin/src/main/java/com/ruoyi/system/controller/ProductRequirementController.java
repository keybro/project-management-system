package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.IProductPlanService;
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
import com.ruoyi.system.domain.ProductRequirement;
import com.ruoyi.system.service.IProductRequirementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 研发需求Controller
 * 
 * @author lrj
 * @date 2023-03-08
 */
@RestController
@RequestMapping("/system/requirement")
public class ProductRequirementController extends BaseController
{
    @Autowired
    private IProductRequirementService productRequirementService;

    @Autowired
    private IProductPlanService productPlanService;

    @Autowired
    private IProductService productService;

    /**
     * 查询研发需求列表
     */
    @PreAuthorize("@ss.hasPermi('system:requirement:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProductRequirement productRequirement)
    {
        startPage();
        List<ProductRequirement> list = productRequirementService.selectProductRequirementList(productRequirement);
        for (ProductRequirement temp :
                list) {
            temp.setProductName(productService.selectProductByProductId(temp.getProductId()).getProductName());
            temp.setPlanName(productPlanService.selectProductPlanByPanId(temp.getProductPlanId()).getPlanName());

        }
        return getDataTable(list);
    }

    /**
     * 导出研发需求列表
     */
    @PreAuthorize("@ss.hasPermi('system:requirement:export')")
    @Log(title = "研发需求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProductRequirement productRequirement)
    {
        List<ProductRequirement> list = productRequirementService.selectProductRequirementList(productRequirement);
        ExcelUtil<ProductRequirement> util = new ExcelUtil<ProductRequirement>(ProductRequirement.class);
        util.exportExcel(response, list, "研发需求数据");
    }

    /**
     * 获取研发需求详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:requirement:query')")
    @GetMapping(value = "/{productRequirementId}")
    public AjaxResult getInfo(@PathVariable("productRequirementId") Long productRequirementId)
    {
        return success(productRequirementService.selectProductRequirementByProductRequirementId(productRequirementId));
    }

    /**
     * 新增研发需求
     */
    @PreAuthorize("@ss.hasPermi('system:requirement:add')")
    @Log(title = "研发需求", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProductRequirement productRequirement)
    {
        return toAjax(productRequirementService.insertProductRequirement(productRequirement));
    }

    /**
     * 修改研发需求
     */
    @PreAuthorize("@ss.hasPermi('system:requirement:edit')")
    @Log(title = "研发需求", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProductRequirement productRequirement)
    {
        return toAjax(productRequirementService.updateProductRequirement(productRequirement));
    }

    /**
     * 删除研发需求
     */
    @PreAuthorize("@ss.hasPermi('system:requirement:remove')")
    @Log(title = "研发需求", businessType = BusinessType.DELETE)
	@DeleteMapping("/{productRequirementIds}")
    public AjaxResult remove(@PathVariable Long[] productRequirementIds)
    {
        return toAjax(productRequirementService.deleteProductRequirementByProductRequirementIds(productRequirementIds));
    }
}

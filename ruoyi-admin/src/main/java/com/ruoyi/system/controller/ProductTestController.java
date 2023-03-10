package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.Product;
import com.ruoyi.system.service.IItemSetService;
import com.ruoyi.system.service.ISysUserService;
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
import com.ruoyi.system.domain.ProductTest;
import com.ruoyi.system.service.IProductTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品测试Controller
 * 
 * @author lrj
 * @date 2023-03-10
 */
@RestController
@RequestMapping("/system/productTest")
public class ProductTestController extends BaseController
{
    @Autowired
    private IProductTestService productTestService;

    @Autowired
    private ISysUserService userService;

    @Autowired
    private IItemSetService itemSetService;

    /**
     * 查询产品测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:productTest:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProductTest productTest)
    {
        startPage();
        List<ProductTest> list = productTestService.selectProductTestList(productTest);
        for (ProductTest temp :
                list) {
            temp.setProductPrincipalName(userService.selectUserById(temp.getProductPrincipalId()).getNickName());
            temp.setTestPrincipalName(userService.selectUserById(temp.getTestPrincipalId()).getNickName());
            temp.setItemSetName(itemSetService.selectItemSetByItemSetId(temp.getItemSetId()).getItemSetName());
        }
        return getDataTable(list);
    }

    /**
     * 导出产品测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:productTest:export')")
    @Log(title = "产品测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProductTest productTest)
    {
        List<ProductTest> list = productTestService.selectProductTestList(productTest);
        ExcelUtil<ProductTest> util = new ExcelUtil<ProductTest>(ProductTest.class);
        util.exportExcel(response, list, "产品测试数据");
    }

    /**
     * 获取产品测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:productTest:query')")
    @GetMapping(value = "/{productId}")
    public AjaxResult getInfo(@PathVariable("productId") Long productId)
    {
        return success(productTestService.selectProductTestByProductId(productId));
    }

    /**
     * 新增产品测试
     */
    @PreAuthorize("@ss.hasPermi('system:productTest:add')")
    @Log(title = "产品测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProductTest productTest)
    {
        return toAjax(productTestService.insertProductTest(productTest));
    }

    /**
     * 修改产品测试
     */
    @PreAuthorize("@ss.hasPermi('system:productTest:edit')")
    @Log(title = "产品测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProductTest productTest)
    {
        return toAjax(productTestService.updateProductTest(productTest));
    }

    /**
     * 删除产品测试
     */
    @PreAuthorize("@ss.hasPermi('system:productTest:remove')")
    @Log(title = "产品测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{productIds}")
    public AjaxResult remove(@PathVariable Long[] productIds)
    {
        return toAjax(productTestService.deleteProductTestByProductIds(productIds));
    }
}

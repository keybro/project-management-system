package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.IProductRequirementService;
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
import com.ruoyi.system.domain.TestExp;
import com.ruoyi.system.service.ITestExpService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试列表Controller
 * 
 * @author lrj
 * @date 2023-03-09
 */
@RestController
@RequestMapping("/system/exp")
public class TestExpController extends BaseController
{
    @Autowired
    private ITestExpService testExpService;

    @Autowired
    private IProductService productService;

    @Autowired
    IProductRequirementService requirementService;

    /**
     * 查询测试列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:exp:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestExp testExp)
    {
        startPage();
        List<TestExp> list = testExpService.selectTestExpList(testExp);
        for (TestExp temp :
                list) {
            temp.setProductName(productService.selectProductByProductId(temp.getProductId()).getProductName());
            temp.setRequireName(requirementService.selectProductRequirementByProductRequirementId(temp.getRelateRequirementId()).getRequirementName());
        }
        return getDataTable(list);
    }

    /**
     * 导出测试列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:exp:export')")
    @Log(title = "测试列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestExp testExp)
    {
        List<TestExp> list = testExpService.selectTestExpList(testExp);
        ExcelUtil<TestExp> util = new ExcelUtil<TestExp>(TestExp.class);
        util.exportExcel(response, list, "测试列表数据");
    }

    /**
     * 获取测试列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:exp:query')")
    @GetMapping(value = "/{testId}")
    public AjaxResult getInfo(@PathVariable("testId") Long testId)
    {
        return success(testExpService.selectTestExpByTestId(testId));
    }

    /**
     * 新增测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:exp:add')")
    @Log(title = "测试列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestExp testExp)
    {
        return toAjax(testExpService.insertTestExp(testExp));
    }

    /**
     * 修改测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:exp:edit')")
    @Log(title = "测试列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestExp testExp)
    {
        return toAjax(testExpService.updateTestExp(testExp));
    }

    /**
     * 删除测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:exp:remove')")
    @Log(title = "测试列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{testIds}")
    public AjaxResult remove(@PathVariable Long[] testIds)
    {
        return toAjax(testExpService.deleteTestExpByTestIds(testIds));
    }
}

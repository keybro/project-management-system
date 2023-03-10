package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.TestStep;
import com.ruoyi.system.service.ITestStepService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试步骤Controller
 * 
 * @author lrj
 * @date 2023-03-10
 */
@RestController
@RequestMapping("/system/step")
public class TestStepController extends BaseController
{
    @Autowired
    private ITestStepService testStepService;

    /**
     * 查询测试步骤列表
     */
    @PreAuthorize("@ss.hasPermi('system:step:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestStep testStep)
    {
        startPage();
        List<TestStep> list = testStepService.selectTestStepList(testStep);
        return getDataTable(list);
    }

    /**
     * 导出测试步骤列表
     */
    @PreAuthorize("@ss.hasPermi('system:step:export')")
    @Log(title = "测试步骤", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestStep testStep)
    {
        List<TestStep> list = testStepService.selectTestStepList(testStep);
        ExcelUtil<TestStep> util = new ExcelUtil<TestStep>(TestStep.class);
        util.exportExcel(response, list, "测试步骤数据");
    }

    /**
     * 获取测试步骤详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:step:query')")
    @GetMapping(value = "/{stepId}")
    public AjaxResult getInfo(@PathVariable("stepId") Long stepId)
    {
        return success(testStepService.selectTestStepByStepId(stepId));
    }

    /**
     * 新增测试步骤
     */
    @PreAuthorize("@ss.hasPermi('system:step:add')")
    @Log(title = "测试步骤", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestStep testStep)
    {
        return toAjax(testStepService.insertTestStep(testStep));
    }

    /**
     * 修改测试步骤
     */
    @PreAuthorize("@ss.hasPermi('system:step:edit')")
    @Log(title = "测试步骤", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestStep testStep)
    {
        return toAjax(testStepService.updateTestStep(testStep));
    }

    /**
     * 删除测试步骤
     */
    @PreAuthorize("@ss.hasPermi('system:step:remove')")
    @Log(title = "测试步骤", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stepIds}")
    public AjaxResult remove(@PathVariable Long[] stepIds)
    {
        return toAjax(testStepService.deleteTestStepByStepIds(stepIds));
    }
}

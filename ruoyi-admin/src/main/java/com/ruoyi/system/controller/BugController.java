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
import com.ruoyi.system.domain.Bug;
import com.ruoyi.system.service.IBugService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * bug列表Controller
 * 
 * @author lrj
 * @date 2023-03-09
 */
@RestController
@RequestMapping("/system/bug")
public class BugController extends BaseController
{
    @Autowired
    private IBugService bugService;

    /**
     * 查询bug列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:bug:list')")
    @GetMapping("/list")
    public TableDataInfo list(Bug bug)
    {
        startPage();
        List<Bug> list = bugService.selectBugList(bug);
        return getDataTable(list);
    }

    /**
     * 导出bug列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:bug:export')")
    @Log(title = "bug列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Bug bug)
    {
        List<Bug> list = bugService.selectBugList(bug);
        ExcelUtil<Bug> util = new ExcelUtil<Bug>(Bug.class);
        util.exportExcel(response, list, "bug列表数据");
    }

    /**
     * 获取bug列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:bug:query')")
    @GetMapping(value = "/{bugId}")
    public AjaxResult getInfo(@PathVariable("bugId") Long bugId)
    {
        return success(bugService.selectBugByBugId(bugId));
    }

    /**
     * 新增bug列表
     */
    @PreAuthorize("@ss.hasPermi('system:bug:add')")
    @Log(title = "bug列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Bug bug)
    {
        return toAjax(bugService.insertBug(bug));
    }

    /**
     * 修改bug列表
     */
    @PreAuthorize("@ss.hasPermi('system:bug:edit')")
    @Log(title = "bug列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Bug bug)
    {
        return toAjax(bugService.updateBug(bug));
    }

    /**
     * 删除bug列表
     */
    @PreAuthorize("@ss.hasPermi('system:bug:remove')")
    @Log(title = "bug列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bugIds}")
    public AjaxResult remove(@PathVariable Long[] bugIds)
    {
        return toAjax(bugService.deleteBugByBugIds(bugIds));
    }
}

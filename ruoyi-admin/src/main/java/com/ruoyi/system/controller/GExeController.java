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
import com.ruoyi.system.domain.GExe;
import com.ruoyi.system.service.IGExeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 执行团队Controller
 * 
 * @author ruoyi
 * @date 2023-03-09
 */
@RestController
@RequestMapping("/system/exe")
public class GExeController extends BaseController
{
    @Autowired
    private IGExeService gExeService;

    /**
     * 查询执行团队列表
     */
    @PreAuthorize("@ss.hasPermi('system:exe:list')")
    @GetMapping("/list")
    public TableDataInfo list(GExe gExe)
    {
        startPage();
        List<GExe> list = gExeService.selectGExeList(gExe);
        return getDataTable(list);
    }

    /**
     * 导出执行团队列表
     */
    @PreAuthorize("@ss.hasPermi('system:exe:export')")
    @Log(title = "执行团队", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GExe gExe)
    {
        List<GExe> list = gExeService.selectGExeList(gExe);
        ExcelUtil<GExe> util = new ExcelUtil<GExe>(GExe.class);
        util.exportExcel(response, list, "执行团队数据");
    }

    /**
     * 获取执行团队详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:exe:query')")
    @GetMapping(value = "/{groupId}")
    public AjaxResult getInfo(@PathVariable("groupId") Long groupId)
    {
        return success(gExeService.selectGExeByGroupId(groupId));
    }

    /**
     * 新增执行团队
     */
    @PreAuthorize("@ss.hasPermi('system:exe:add')")
    @Log(title = "执行团队", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GExe gExe)
    {
        return toAjax(gExeService.insertGExe(gExe));
    }

    /**
     * 修改执行团队
     */
    @PreAuthorize("@ss.hasPermi('system:exe:edit')")
    @Log(title = "执行团队", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GExe gExe)
    {
        return toAjax(gExeService.updateGExe(gExe));
    }

    /**
     * 删除执行团队
     */
    @PreAuthorize("@ss.hasPermi('system:exe:remove')")
    @Log(title = "执行团队", businessType = BusinessType.DELETE)
	@DeleteMapping("/{groupIds}")
    public AjaxResult remove(@PathVariable Long[] groupIds)
    {
        return toAjax(gExeService.deleteGExeByGroupIds(groupIds));
    }
}

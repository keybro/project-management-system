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
import com.ruoyi.system.domain.Group;
import com.ruoyi.system.service.IGroupService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 团队列表Controller
 * 
 * @author lrj
 * @date 2023-03-09
 */
@RestController
@RequestMapping("/system/group")
public class GroupController extends BaseController
{
    @Autowired
    private IGroupService groupService;

    /**
     * 查询团队列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:list')")
    @GetMapping("/list")
    public TableDataInfo list(Group group)
    {
        startPage();
        List<Group> list = groupService.selectGroupList(group);
        return getDataTable(list);
    }

    /**
     * 导出团队列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:export')")
    @Log(title = "团队列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Group group)
    {
        List<Group> list = groupService.selectGroupList(group);
        ExcelUtil<Group> util = new ExcelUtil<Group>(Group.class);
        util.exportExcel(response, list, "团队列表数据");
    }

    /**
     * 获取团队列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:group:query')")
    @GetMapping(value = "/{groupId}")
    public AjaxResult getInfo(@PathVariable("groupId") Long groupId)
    {
        return success(groupService.selectGroupByGroupId(groupId));
    }

    /**
     * 新增团队列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:add')")
    @Log(title = "团队列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Group group)
    {
        return toAjax(groupService.insertGroup(group));
    }

    /**
     * 修改团队列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:edit')")
    @Log(title = "团队列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Group group)
    {
        return toAjax(groupService.updateGroup(group));
    }

    /**
     * 删除团队列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:remove')")
    @Log(title = "团队列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{groupIds}")
    public AjaxResult remove(@PathVariable Long[] groupIds)
    {
        return toAjax(groupService.deleteGroupByGroupIds(groupIds));
    }
}

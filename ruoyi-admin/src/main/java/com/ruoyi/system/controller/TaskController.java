package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.IExecuteService;
import com.ruoyi.system.service.IProductRequirementService;
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
import com.ruoyi.system.domain.Task;
import com.ruoyi.system.service.ITaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务列表Controller
 * 
 * @author lrj
 * @date 2023-03-09
 */
@RestController
@RequestMapping("/system/task")
public class TaskController extends BaseController
{
    @Autowired
    private ITaskService taskService;

    @Autowired
    private IExecuteService executeService;

    @Autowired
    private ISysUserService userService;

    @Autowired
    private IProductRequirementService requirementService;

    /**
     * 查询任务列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(Task task)
    {
        startPage();
        List<Task> list = taskService.selectTaskList(task);
        for (Task temp :
                list) {
            temp.setExecuteName(executeService.selectExecuteByExecuteId(temp.getExecuteId()).getExecuteName());
            temp.setDesignateName(userService.selectUserById(temp.getDesignateId()).getNickName());
            temp.setRelateRequirementName(requirementService.selectProductRequirementByProductRequirementId((long) Integer.parseInt(temp.getRelateRequirement())).getRequirementName());
        }
        return getDataTable(list);
    }

    /**
     * 导出任务列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:export')")
    @Log(title = "任务列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Task task)
    {
        List<Task> list = taskService.selectTaskList(task);
        ExcelUtil<Task> util = new ExcelUtil<Task>(Task.class);
        util.exportExcel(response, list, "任务列表数据");
    }

    /**
     * 获取任务列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:task:query')")
    @GetMapping(value = "/{taskId}")
    public AjaxResult getInfo(@PathVariable("taskId") Long taskId)
    {
        return success(taskService.selectTaskByTaskId(taskId));
    }

    /**
     * 新增任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:add')")
    @Log(title = "任务列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Task task)
    {
        return toAjax(taskService.insertTask(task));
    }

    /**
     * 修改任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:edit')")
    @Log(title = "任务列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Task task)
    {
        return toAjax(taskService.updateTask(task));
    }

    /**
     * 删除任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:remove')")
    @Log(title = "任务列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{taskIds}")
    public AjaxResult remove(@PathVariable Long[] taskIds)
    {
        return toAjax(taskService.deleteTaskByTaskIds(taskIds));
    }
}

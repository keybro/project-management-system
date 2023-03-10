package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TaskMapper;
import com.ruoyi.system.domain.Task;
import com.ruoyi.system.service.ITaskService;

/**
 * 任务列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-09
 */
@Service
public class TaskServiceImpl implements ITaskService 
{
    @Autowired
    private TaskMapper taskMapper;

    /**
     * 查询任务列表
     * 
     * @param taskId 任务列表主键
     * @return 任务列表
     */
    @Override
    public Task selectTaskByTaskId(Long taskId)
    {
        return taskMapper.selectTaskByTaskId(taskId);
    }

    /**
     * 查询任务列表列表
     * 
     * @param task 任务列表
     * @return 任务列表
     */
    @Override
    public List<Task> selectTaskList(Task task)
    {
        return taskMapper.selectTaskList(task);
    }

    /**
     * 新增任务列表
     * 
     * @param task 任务列表
     * @return 结果
     */
    @Override
    public int insertTask(Task task)
    {
        return taskMapper.insertTask(task);
    }

    /**
     * 修改任务列表
     * 
     * @param task 任务列表
     * @return 结果
     */
    @Override
    public int updateTask(Task task)
    {
        return taskMapper.updateTask(task);
    }

    /**
     * 批量删除任务列表
     * 
     * @param taskIds 需要删除的任务列表主键
     * @return 结果
     */
    @Override
    public int deleteTaskByTaskIds(Long[] taskIds)
    {
        return taskMapper.deleteTaskByTaskIds(taskIds);
    }

    /**
     * 删除任务列表信息
     * 
     * @param taskId 任务列表主键
     * @return 结果
     */
    @Override
    public int deleteTaskByTaskId(Long taskId)
    {
        return taskMapper.deleteTaskByTaskId(taskId);
    }
}

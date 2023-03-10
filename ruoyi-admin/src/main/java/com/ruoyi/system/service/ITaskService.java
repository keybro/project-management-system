package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Task;

/**
 * 任务列表Service接口
 * 
 * @author lrj
 * @date 2023-03-09
 */
public interface ITaskService 
{
    /**
     * 查询任务列表
     * 
     * @param taskId 任务列表主键
     * @return 任务列表
     */
    public Task selectTaskByTaskId(Long taskId);

    /**
     * 查询任务列表列表
     * 
     * @param task 任务列表
     * @return 任务列表集合
     */
    public List<Task> selectTaskList(Task task);

    /**
     * 新增任务列表
     * 
     * @param task 任务列表
     * @return 结果
     */
    public int insertTask(Task task);

    /**
     * 修改任务列表
     * 
     * @param task 任务列表
     * @return 结果
     */
    public int updateTask(Task task);

    /**
     * 批量删除任务列表
     * 
     * @param taskIds 需要删除的任务列表主键集合
     * @return 结果
     */
    public int deleteTaskByTaskIds(Long[] taskIds);

    /**
     * 删除任务列表信息
     * 
     * @param taskId 任务列表主键
     * @return 结果
     */
    public int deleteTaskByTaskId(Long taskId);
}

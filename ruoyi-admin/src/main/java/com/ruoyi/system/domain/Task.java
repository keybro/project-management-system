package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务列表对象 task
 * 
 * @author lrj
 * @date 2023-03-09
 */
public class Task extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 执行id */
    private Long taskId;

    /** 所属执行id */
    @Excel(name = "所属执行id")
    private Long executeId;

    /** 任务类型 */
    @Excel(name = "任务类型")
    private Long taskType;

    /** 指派人id */
    @Excel(name = "指派人id")
    private Long designateId;

    /** 指派人姓名 */
    @Excel(name = "指派人姓名")
    private String designateName;

    /** 相关研发需求 */
    @Excel(name = "相关研发需求")
    private String relateRequirement;

    /** 任务名城管 */
    @Excel(name = "任务名城管")
    private String taskName;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 优先级 */
    @Excel(name = "优先级")
    private Long priority;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    /** 实际开始时间 */
    @Excel(name = "实际开始时间")
    private String actualStartTime;

    /** 总耗时 */
    @Excel(name = "总耗时")
    private Long timeConsuming;

    /** 任务状态 */
    @Excel(name = "任务状态")
    private Long taskState;

    private String executeName;

    private String relateRequirementName;

    public String getRelateRequirementName() {
        return relateRequirementName;
    }

    public void setRelateRequirementName(String relateRequirementName) {
        this.relateRequirementName = relateRequirementName;
    }

    public String getExecuteName() {
        return executeName;
    }

    public void setExecuteName(String executeName) {
        this.executeName = executeName;
    }

    public void setTaskId(Long taskId)
    {
        this.taskId = taskId;
    }

    public Long getTaskId() 
    {
        return taskId;
    }
    public void setExecuteId(Long executeId) 
    {
        this.executeId = executeId;
    }

    public Long getExecuteId() 
    {
        return executeId;
    }
    public void setTaskType(Long taskType) 
    {
        this.taskType = taskType;
    }

    public Long getTaskType() 
    {
        return taskType;
    }
    public void setDesignateId(Long designateId) 
    {
        this.designateId = designateId;
    }

    public Long getDesignateId() 
    {
        return designateId;
    }
    public void setDesignateName(String designateName) 
    {
        this.designateName = designateName;
    }

    public String getDesignateName() 
    {
        return designateName;
    }
    public void setRelateRequirement(String relateRequirement) 
    {
        this.relateRequirement = relateRequirement;
    }

    public String getRelateRequirement() 
    {
        return relateRequirement;
    }
    public void setTaskName(String taskName) 
    {
        this.taskName = taskName;
    }

    public String getTaskName() 
    {
        return taskName;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }
    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public String getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(String endTime) 
    {
        this.endTime = endTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }
    public void setActualStartTime(String actualStartTime) 
    {
        this.actualStartTime = actualStartTime;
    }

    public String getActualStartTime() 
    {
        return actualStartTime;
    }
    public void setTimeConsuming(Long timeConsuming) 
    {
        this.timeConsuming = timeConsuming;
    }

    public Long getTimeConsuming() 
    {
        return timeConsuming;
    }
    public void setTaskState(Long taskState) 
    {
        this.taskState = taskState;
    }

    public Long getTaskState() 
    {
        return taskState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskId", getTaskId())
            .append("executeId", getExecuteId())
            .append("taskType", getTaskType())
            .append("designateId", getDesignateId())
            .append("designateName", getDesignateName())
            .append("relateRequirement", getRelateRequirement())
            .append("taskName", getTaskName())
            .append("description", getDescription())
            .append("priority", getPriority())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("actualStartTime", getActualStartTime())
            .append("timeConsuming", getTimeConsuming())
            .append("taskState", getTaskState())
            .toString();
    }
}

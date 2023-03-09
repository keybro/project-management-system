package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目集对象 item_set
 * 
 * @author lrj
 * @date 2023-03-08
 */
public class ItemSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目集id */
    private Long itemSetId;

    /** 项目集名称 */
    @Excel(name = "项目集名称")
    private String itemSetName;

    /** 负责人id */
    private Long principalId;

    /** 负责人姓名 */
    @Excel(name = "负责人姓名")
    private String principalName;

    /** 预算 */
    @Excel(name = "预算")
    private String budget;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    /** 描述 */
    private String description;

    /** 状态 */
    @Excel(name = "状态")
    private Long state;

    public void setItemSetId(Long itemSetId) 
    {
        this.itemSetId = itemSetId;
    }

    public Long getItemSetId() 
    {
        return itemSetId;
    }
    public void setItemSetName(String itemSetName) 
    {
        this.itemSetName = itemSetName;
    }

    public String getItemSetName() 
    {
        return itemSetName;
    }
    public void setPrincipalId(Long principalId) 
    {
        this.principalId = principalId;
    }

    public Long getPrincipalId() 
    {
        return principalId;
    }
    public void setPrincipalName(String principalName) 
    {
        this.principalName = principalName;
    }

    public String getPrincipalName() 
    {
        return principalName;
    }
    public void setBudget(String budget) 
    {
        this.budget = budget;
    }

    public String getBudget() 
    {
        return budget;
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
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemSetId", getItemSetId())
            .append("itemSetName", getItemSetName())
            .append("principalId", getPrincipalId())
            .append("principalName", getPrincipalName())
            .append("budget", getBudget())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("description", getDescription())
            .append("state", getState())
            .toString();
    }
}

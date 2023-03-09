package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目列表对象 item
 * 
 * @author lrj
 * @date 2023-03-08
 */
public class Item extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目id */
    private Long itemId;

    /** 所属项目集id */
    @Excel(name = "所属项目集id")
    private Long itemSetId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String itemName;

    /** 项目代号 */
    @Excel(name = "项目代号")
    private String itemCode;

    /** 负责人id */
    @Excel(name = "负责人id")
    private Long principalId;

    /** 预算 */
    @Excel(name = "预算")
    private String budget;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    /** 关联产品id */
    @Excel(name = "关联产品id")
    private Long relatedProductId;

    /** 关联产品名称 */
    private String relatedProductName;

    /** 关联计划id */
    @Excel(name = "关联计划id")
    private Long relatedPlanId;

    /** 关联计划名称 */
    private String relatedPlanName;

    /** 描述 */
    private String description;

    /** 实际开始时间 */
    @Excel(name = "实际开始时间")
    private String actualStartTime;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    private String itemSetName;

    private String principalName;

    public String getItemSetName() {
        return itemSetName;
    }

    public void setItemSetName(String itemSetName) {
        this.itemSetName = itemSetName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public void setItemId(Long itemId)
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setItemSetId(Long itemSetId) 
    {
        this.itemSetId = itemSetId;
    }

    public Long getItemSetId() 
    {
        return itemSetId;
    }
    public void setItemName(String itemName) 
    {
        this.itemName = itemName;
    }

    public String getItemName() 
    {
        return itemName;
    }
    public void setItemCode(String itemCode) 
    {
        this.itemCode = itemCode;
    }

    public String getItemCode() 
    {
        return itemCode;
    }
    public void setPrincipalId(Long principalId) 
    {
        this.principalId = principalId;
    }

    public Long getPrincipalId() 
    {
        return principalId;
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
    public void setRelatedProductId(Long relatedProductId) 
    {
        this.relatedProductId = relatedProductId;
    }

    public Long getRelatedProductId() 
    {
        return relatedProductId;
    }
    public void setRelatedProductName(String relatedProductName) 
    {
        this.relatedProductName = relatedProductName;
    }

    public String getRelatedProductName() 
    {
        return relatedProductName;
    }
    public void setRelatedPlanId(Long relatedPlanId) 
    {
        this.relatedPlanId = relatedPlanId;
    }

    public Long getRelatedPlanId() 
    {
        return relatedPlanId;
    }
    public void setRelatedPlanName(String relatedPlanName) 
    {
        this.relatedPlanName = relatedPlanName;
    }

    public String getRelatedPlanName() 
    {
        return relatedPlanName;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setActualStartTime(String actualStartTime) 
    {
        this.actualStartTime = actualStartTime;
    }

    public String getActualStartTime() 
    {
        return actualStartTime;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("itemSetId", getItemSetId())
            .append("itemName", getItemName())
            .append("itemCode", getItemCode())
            .append("principalId", getPrincipalId())
            .append("budget", getBudget())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("relatedProductId", getRelatedProductId())
            .append("relatedProductName", getRelatedProductName())
            .append("relatedPlanId", getRelatedPlanId())
            .append("relatedPlanName", getRelatedPlanName())
            .append("description", getDescription())
            .append("actualStartTime", getActualStartTime())
            .append("status", getStatus())
            .toString();
    }
}

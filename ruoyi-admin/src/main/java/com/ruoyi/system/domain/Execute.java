package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 执行列表对象 execute
 * 
 * @author lrj
 * @date 2023-03-08
 */
public class Execute extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 执行id */
    private Long executeId;

    /** 所属项目id */
    @Excel(name = "所属项目id")
    private Long itemId;

    /** 执行名称 */
    @Excel(name = "执行名称")
    private String executeName;

    /** 执行代号 */
    @Excel(name = "执行代号")
    private String executeCode;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    /** 执行类型 */
    @Excel(name = "执行类型")
    private Long executeType;

    /** 关联产品id */
    private Long relatedProductId;

    /** 关联计划id */
    private Long relatedPlanId;

    /** 产品负责人id */
    @Excel(name = "产品负责人id")
    private Long productPrincipalId;

    /** 测试负责人id */
    @Excel(name = "测试负责人id")
    private Long testPrincipalId;

    /** 迭代负责人id */
    @Excel(name = "迭代负责人id")
    private Long iterationPrincipalId;

    /** 团队成员 */
    private String teamMembersIds;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    private String itemName;

    private String relatedProductName;

    private String relatedPlanName;

    private String productPrincipalName;

    private String testPrincipalName;

    private String iterationPrincipalName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRelatedProductName() {
        return relatedProductName;
    }

    public void setRelatedProductName(String relatedProductName) {
        this.relatedProductName = relatedProductName;
    }

    public String getRelatedPlanName() {
        return relatedPlanName;
    }

    public void setRelatedPlanName(String relatedPlanName) {
        this.relatedPlanName = relatedPlanName;
    }

    public String getProductPrincipalName() {
        return productPrincipalName;
    }

    public void setProductPrincipalName(String productPrincipalName) {
        this.productPrincipalName = productPrincipalName;
    }

    public String getTestPrincipalName() {
        return testPrincipalName;
    }

    public void setTestPrincipalName(String testPrincipalName) {
        this.testPrincipalName = testPrincipalName;
    }

    public String getIterationPrincipalName() {
        return iterationPrincipalName;
    }

    public void setIterationPrincipalName(String iterationPrincipalName) {
        this.iterationPrincipalName = iterationPrincipalName;
    }

    public void setExecuteId(Long executeId)
    {
        this.executeId = executeId;
    }

    public Long getExecuteId() 
    {
        return executeId;
    }
    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setExecuteName(String executeName) 
    {
        this.executeName = executeName;
    }

    public String getExecuteName() 
    {
        return executeName;
    }
    public void setExecuteCode(String executeCode) 
    {
        this.executeCode = executeCode;
    }

    public String getExecuteCode() 
    {
        return executeCode;
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
    public void setExecuteType(Long executeType) 
    {
        this.executeType = executeType;
    }

    public Long getExecuteType() 
    {
        return executeType;
    }
    public void setRelatedProductId(Long relatedProductId) 
    {
        this.relatedProductId = relatedProductId;
    }

    public Long getRelatedProductId() 
    {
        return relatedProductId;
    }
    public void setRelatedPlanId(Long relatedPlanId) 
    {
        this.relatedPlanId = relatedPlanId;
    }

    public Long getRelatedPlanId() 
    {
        return relatedPlanId;
    }
    public void setProductPrincipalId(Long productPrincipalId) 
    {
        this.productPrincipalId = productPrincipalId;
    }

    public Long getProductPrincipalId() 
    {
        return productPrincipalId;
    }
    public void setTestPrincipalId(Long testPrincipalId) 
    {
        this.testPrincipalId = testPrincipalId;
    }

    public Long getTestPrincipalId() 
    {
        return testPrincipalId;
    }
    public void setIterationPrincipalId(Long iterationPrincipalId) 
    {
        this.iterationPrincipalId = iterationPrincipalId;
    }

    public Long getIterationPrincipalId() 
    {
        return iterationPrincipalId;
    }
    public void setTeamMembersIds(String teamMembersIds) 
    {
        this.teamMembersIds = teamMembersIds;
    }

    public String getTeamMembersIds() 
    {
        return teamMembersIds;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("executeId", getExecuteId())
            .append("itemId", getItemId())
            .append("executeName", getExecuteName())
            .append("executeCode", getExecuteCode())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("executeType", getExecuteType())
            .append("relatedProductId", getRelatedProductId())
            .append("relatedPlanId", getRelatedPlanId())
            .append("productPrincipalId", getProductPrincipalId())
            .append("testPrincipalId", getTestPrincipalId())
            .append("iterationPrincipalId", getIterationPrincipalId())
            .append("teamMembersIds", getTeamMembersIds())
            .append("description", getDescription())
            .toString();
    }
}

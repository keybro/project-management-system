package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 研发需求对象 product_requirement
 * 
 * @author lrj
 * @date 2023-03-08
 */
public class ProductRequirement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品需求id */
    private Long productRequirementId;

    /** 所属产品id */
    @Excel(name = "所属产品id")
    private Long productId;

    /** 所属产品计划id */
    @Excel(name = "所属产品计划id")
    private Long productPlanId;

    /** 需求来源类型 */
    @Excel(name = "需求来源类型")
    private Long sourceType;

    /** 需求名称 */
    @Excel(name = "需求名称")
    private String requirementName;

    /** 需求类别 */
    @Excel(name = "需求类别")
    private Long requirementType;

    /** 优先级 */
    @Excel(name = "优先级")
    private Long priority;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 验收标准 */
    @Excel(name = "验收标准")
    private String acceptanceStandard;

    /** 创建者id */
    private Long createUserId;

    /** 创建者姓名 */
    @Excel(name = "创建者姓名")
    private String createUserName;

    /** 支配人id */
    @Excel(name = "支配人id")
    private Long designateUserId;

    /** 指派人姓名 */
    @Excel(name = "指派人姓名")
    private String designateUserName;

    /** 指派备注 */
    private String designateRemark;

    /** 阶段 */
    @Excel(name = "阶段")
    private Long stage;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    private String productName;

    private String planName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setProductRequirementId(Long productRequirementId)
    {
        this.productRequirementId = productRequirementId;
    }

    public Long getProductRequirementId() 
    {
        return productRequirementId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setProductPlanId(Long productPlanId) 
    {
        this.productPlanId = productPlanId;
    }

    public Long getProductPlanId() 
    {
        return productPlanId;
    }
    public void setSourceType(Long sourceType) 
    {
        this.sourceType = sourceType;
    }

    public Long getSourceType() 
    {
        return sourceType;
    }
    public void setRequirementName(String requirementName) 
    {
        this.requirementName = requirementName;
    }

    public String getRequirementName() 
    {
        return requirementName;
    }
    public void setRequirementType(Long requirementType) 
    {
        this.requirementType = requirementType;
    }

    public Long getRequirementType() 
    {
        return requirementType;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setAcceptanceStandard(String acceptanceStandard) 
    {
        this.acceptanceStandard = acceptanceStandard;
    }

    public String getAcceptanceStandard() 
    {
        return acceptanceStandard;
    }
    public void setCreateUserId(Long createUserId) 
    {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() 
    {
        return createUserId;
    }
    public void setCreateUserName(String createUserName) 
    {
        this.createUserName = createUserName;
    }

    public String getCreateUserName() 
    {
        return createUserName;
    }
    public void setDesignateUserId(Long designateUserId) 
    {
        this.designateUserId = designateUserId;
    }

    public Long getDesignateUserId() 
    {
        return designateUserId;
    }
    public void setDesignateUserName(String designateUserName) 
    {
        this.designateUserName = designateUserName;
    }

    public String getDesignateUserName() 
    {
        return designateUserName;
    }
    public void setDesignateRemark(String designateRemark) 
    {
        this.designateRemark = designateRemark;
    }

    public String getDesignateRemark() 
    {
        return designateRemark;
    }
    public void setStage(Long stage) 
    {
        this.stage = stage;
    }

    public Long getStage() 
    {
        return stage;
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
            .append("productRequirementId", getProductRequirementId())
            .append("productId", getProductId())
            .append("productPlanId", getProductPlanId())
            .append("sourceType", getSourceType())
            .append("requirementName", getRequirementName())
            .append("requirementType", getRequirementType())
            .append("priority", getPriority())
            .append("description", getDescription())
            .append("acceptanceStandard", getAcceptanceStandard())
            .append("createUserId", getCreateUserId())
            .append("createUserName", getCreateUserName())
            .append("designateUserId", getDesignateUserId())
            .append("designateUserName", getDesignateUserName())
            .append("designateRemark", getDesignateRemark())
            .append("stage", getStage())
            .append("status", getStatus())
            .toString();
    }
}

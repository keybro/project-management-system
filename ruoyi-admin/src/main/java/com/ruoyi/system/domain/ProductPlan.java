package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品计划列表对象 product_plan
 * 
 * @author lrj
 * @date 2023-03-08
 */
public class ProductPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品计划id */
    private Long panId;

    /** 所属产品id */
    @Excel(name = "所属产品id")
    private Long productId;

    /** 计划名称 */
    @Excel(name = "计划名称")
    private String planName;

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
    private Long planState;

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPanId(Long panId)
    {
        this.panId = panId;
    }

    public Long getPanId() 
    {
        return panId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setPlanName(String planName) 
    {
        this.planName = planName;
    }

    public String getPlanName() 
    {
        return planName;
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
    public void setPlanState(Long planState) 
    {
        this.planState = planState;
    }

    public Long getPlanState() 
    {
        return planState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("panId", getPanId())
            .append("productId", getProductId())
            .append("planName", getPlanName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("description", getDescription())
            .append("planState", getPlanState())
            .toString();
    }
}

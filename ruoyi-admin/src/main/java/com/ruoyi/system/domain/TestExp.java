package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试列表对象 test_exp
 * 
 * @author lrj
 * @date 2023-03-09
 */
public class TestExp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 测试id */
    private Long testId;

    /** 所属产品id */
    @Excel(name = "所属产品id")
    private Long productId;

    /** 相关研发需求 */
    @Excel(name = "相关研发需求")
    private Long relateRequirementId;

    /** 测试标题 */
    @Excel(name = "测试标题")
    private String testTitle;

    /** 创建者id */
    @Excel(name = "创建者id")
    private Long createrId;

    /** 创建者姓名 */
    @Excel(name = "创建者姓名")
    private String createrName;

    /** 结果 */
    @Excel(name = "结果")
    private Long result;

    /** 优先级 */
    @Excel(name = "优先级")
    private Long priority;

    public void setTestId(Long testId) 
    {
        this.testId = testId;
    }

    public Long getTestId() 
    {
        return testId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setRelateRequirementId(Long relateRequirementId) 
    {
        this.relateRequirementId = relateRequirementId;
    }

    public Long getRelateRequirementId() 
    {
        return relateRequirementId;
    }
    public void setTestTitle(String testTitle) 
    {
        this.testTitle = testTitle;
    }

    public String getTestTitle() 
    {
        return testTitle;
    }
    public void setCreaterId(Long createrId) 
    {
        this.createrId = createrId;
    }

    public Long getCreaterId() 
    {
        return createrId;
    }
    public void setCreaterName(String createrName) 
    {
        this.createrName = createrName;
    }

    public String getCreaterName() 
    {
        return createrName;
    }
    public void setResult(Long result) 
    {
        this.result = result;
    }

    public Long getResult() 
    {
        return result;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("testId", getTestId())
            .append("productId", getProductId())
            .append("relateRequirementId", getRelateRequirementId())
            .append("testTitle", getTestTitle())
            .append("createrId", getCreaterId())
            .append("createrName", getCreaterName())
            .append("result", getResult())
            .append("priority", getPriority())
            .toString();
    }
}

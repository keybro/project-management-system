package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试步骤对象 test_step
 * 
 * @author lrj
 * @date 2023-03-10
 */
public class TestStep extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 步骤id */
    private Long stepId;

    /** 所属测试用例id */
    @Excel(name = "所属测试用例id")
    private Long testId;

    /** 步骤 */
    @Excel(name = "步骤")
    private String stepName;

    /** 预期 */
    @Excel(name = "预期")
    private String hope;

    /** 测试结果 */
    @Excel(name = "测试结果")
    private Long result;

    /** 实际情况 */
    @Excel(name = "实际情况")
    private String physicalTruth;

    public void setStepId(Long stepId) 
    {
        this.stepId = stepId;
    }

    public Long getStepId() 
    {
        return stepId;
    }
    public void setTestId(Long testId) 
    {
        this.testId = testId;
    }

    public Long getTestId() 
    {
        return testId;
    }
    public void setStepName(String stepName) 
    {
        this.stepName = stepName;
    }

    public String getStepName() 
    {
        return stepName;
    }
    public void setHope(String hope) 
    {
        this.hope = hope;
    }

    public String getHope() 
    {
        return hope;
    }
    public void setResult(Long result) 
    {
        this.result = result;
    }

    public Long getResult() 
    {
        return result;
    }
    public void setPhysicalTruth(String physicalTruth) 
    {
        this.physicalTruth = physicalTruth;
    }

    public String getPhysicalTruth() 
    {
        return physicalTruth;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stepId", getStepId())
            .append("testId", getTestId())
            .append("stepName", getStepName())
            .append("hope", getHope())
            .append("result", getResult())
            .append("physicalTruth", getPhysicalTruth())
            .toString();
    }
}

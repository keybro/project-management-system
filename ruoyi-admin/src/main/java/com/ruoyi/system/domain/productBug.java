package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品bug列表对象 bug
 * 
 * @author lrj
 * @date 2023-03-10
 */
public class productBug extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** bugid */
    private Long bugId;

    /** 产品id */
    @Excel(name = "产品id")
    private Long productId;

    /** 项目id */
    @Excel(name = "项目id")
    private Long itemId;

    /** 执行id */
    @Excel(name = "执行id")
    private Long executeId;

    /** 指派人id */
    @Excel(name = "指派人id")
    private Long designateId;

    /** bug类型 */
    @Excel(name = "bug类型")
    private Long bugType;

    /** bug标题 */
    @Excel(name = "bug标题")
    private String bugTitle;

    /** 优先级 */
    @Excel(name = "优先级")
    private Long priority;

    /** 重现步骤 */
    @Excel(name = "重现步骤")
    private String reStep;

    /** 相关需求id */
    @Excel(name = "相关需求id")
    private Long relateNeedId;

    /** 相关任务id */
    @Excel(name = "相关任务id")
    private Long relateTaskId;

    /** bug结果 */
    @Excel(name = "bug结果")
    private Long result;

    /** 创建者id */
    private Long createrId;

    /** bug状态 */
    private Long status;

    private String productName;

    private String itemName;

    private String executeName;

    private String designateName;

    private String requireName;

    private String taskName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getExecuteName() {
        return executeName;
    }

    public void setExecuteName(String executeName) {
        this.executeName = executeName;
    }

    public String getDesignateName() {
        return designateName;
    }

    public void setDesignateName(String designateName) {
        this.designateName = designateName;
    }

    public String getRequireName() {
        return requireName;
    }

    public void setRequireName(String requireName) {
        this.requireName = requireName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setBugId(Long bugId)
    {
        this.bugId = bugId;
    }

    public Long getBugId() 
    {
        return bugId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setExecuteId(Long executeId) 
    {
        this.executeId = executeId;
    }

    public Long getExecuteId() 
    {
        return executeId;
    }
    public void setDesignateId(Long designateId) 
    {
        this.designateId = designateId;
    }

    public Long getDesignateId() 
    {
        return designateId;
    }
    public void setBugType(Long bugType) 
    {
        this.bugType = bugType;
    }

    public Long getBugType() 
    {
        return bugType;
    }
    public void setBugTitle(String bugTitle) 
    {
        this.bugTitle = bugTitle;
    }

    public String getBugTitle() 
    {
        return bugTitle;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }
    public void setReStep(String reStep) 
    {
        this.reStep = reStep;
    }

    public String getReStep() 
    {
        return reStep;
    }
    public void setRelateNeedId(Long relateNeedId) 
    {
        this.relateNeedId = relateNeedId;
    }

    public Long getRelateNeedId() 
    {
        return relateNeedId;
    }
    public void setRelateTaskId(Long relateTaskId) 
    {
        this.relateTaskId = relateTaskId;
    }

    public Long getRelateTaskId() 
    {
        return relateTaskId;
    }
    public void setResult(Long result) 
    {
        this.result = result;
    }

    public Long getResult() 
    {
        return result;
    }
    public void setCreaterId(Long createrId) 
    {
        this.createrId = createrId;
    }

    public Long getCreaterId() 
    {
        return createrId;
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
            .append("bugId", getBugId())
            .append("productId", getProductId())
            .append("itemId", getItemId())
            .append("executeId", getExecuteId())
            .append("designateId", getDesignateId())
            .append("bugType", getBugType())
            .append("bugTitle", getBugTitle())
            .append("priority", getPriority())
            .append("reStep", getReStep())
            .append("relateNeedId", getRelateNeedId())
            .append("relateTaskId", getRelateTaskId())
            .append("result", getResult())
            .append("createrId", getCreaterId())
            .append("status", getStatus())
            .toString();
    }
}

package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品列表对象 product
 * 
 * @author lrj
 * @date 2023-03-08
 */
public class Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品id */
    private Long productId;

    /** 所属项目集id */
    private Long itemSetId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 产品代号 */
    private String productCode;

    /** 产品负责人id */
    @Excel(name = "产品负责人id")
    private Long productPrincipalId;

    /** 测试负责人id */
    @Excel(name = "测试负责人id")
    private Long testPrincipalId;

    /** 描述 */
    private String description;

    /** 产品负责人姓名 */
    private String productPrincipalName;

    /** 产品测试人姓名 */
    private String testPrincipalName;

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

    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setItemSetId(Long itemSetId) 
    {
        this.itemSetId = itemSetId;
    }

    public Long getItemSetId() 
    {
        return itemSetId;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
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
            .append("productId", getProductId())
            .append("itemSetId", getItemSetId())
            .append("productName", getProductName())
            .append("productCode", getProductCode())
            .append("productPrincipalId", getProductPrincipalId())
            .append("testPrincipalId", getTestPrincipalId())
            .append("description", getDescription())
            .toString();
    }
}

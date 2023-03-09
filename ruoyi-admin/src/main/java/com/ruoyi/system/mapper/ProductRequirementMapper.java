package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ProductRequirement;

/**
 * 研发需求Mapper接口
 * 
 * @author lrj
 * @date 2023-03-08
 */
public interface ProductRequirementMapper 
{
    /**
     * 查询研发需求
     * 
     * @param productRequirementId 研发需求主键
     * @return 研发需求
     */
    public ProductRequirement selectProductRequirementByProductRequirementId(Long productRequirementId);

    /**
     * 查询研发需求列表
     * 
     * @param productRequirement 研发需求
     * @return 研发需求集合
     */
    public List<ProductRequirement> selectProductRequirementList(ProductRequirement productRequirement);

    /**
     * 新增研发需求
     * 
     * @param productRequirement 研发需求
     * @return 结果
     */
    public int insertProductRequirement(ProductRequirement productRequirement);

    /**
     * 修改研发需求
     * 
     * @param productRequirement 研发需求
     * @return 结果
     */
    public int updateProductRequirement(ProductRequirement productRequirement);

    /**
     * 删除研发需求
     * 
     * @param productRequirementId 研发需求主键
     * @return 结果
     */
    public int deleteProductRequirementByProductRequirementId(Long productRequirementId);

    /**
     * 批量删除研发需求
     * 
     * @param productRequirementIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductRequirementByProductRequirementIds(Long[] productRequirementIds);
}

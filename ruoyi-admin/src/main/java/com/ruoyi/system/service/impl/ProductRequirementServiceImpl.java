package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProductRequirementMapper;
import com.ruoyi.system.domain.ProductRequirement;
import com.ruoyi.system.service.IProductRequirementService;

/**
 * 研发需求Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-08
 */
@Service
public class ProductRequirementServiceImpl implements IProductRequirementService 
{
    @Autowired
    private ProductRequirementMapper productRequirementMapper;

    /**
     * 查询研发需求
     * 
     * @param productRequirementId 研发需求主键
     * @return 研发需求
     */
    @Override
    public ProductRequirement selectProductRequirementByProductRequirementId(Long productRequirementId)
    {
        return productRequirementMapper.selectProductRequirementByProductRequirementId(productRequirementId);
    }

    /**
     * 查询研发需求列表
     * 
     * @param productRequirement 研发需求
     * @return 研发需求
     */
    @Override
    public List<ProductRequirement> selectProductRequirementList(ProductRequirement productRequirement)
    {
        return productRequirementMapper.selectProductRequirementList(productRequirement);
    }

    /**
     * 新增研发需求
     * 
     * @param productRequirement 研发需求
     * @return 结果
     */
    @Override
    public int insertProductRequirement(ProductRequirement productRequirement)
    {
        return productRequirementMapper.insertProductRequirement(productRequirement);
    }

    /**
     * 修改研发需求
     * 
     * @param productRequirement 研发需求
     * @return 结果
     */
    @Override
    public int updateProductRequirement(ProductRequirement productRequirement)
    {
        return productRequirementMapper.updateProductRequirement(productRequirement);
    }

    /**
     * 批量删除研发需求
     * 
     * @param productRequirementIds 需要删除的研发需求主键
     * @return 结果
     */
    @Override
    public int deleteProductRequirementByProductRequirementIds(Long[] productRequirementIds)
    {
        return productRequirementMapper.deleteProductRequirementByProductRequirementIds(productRequirementIds);
    }

    /**
     * 删除研发需求信息
     * 
     * @param productRequirementId 研发需求主键
     * @return 结果
     */
    @Override
    public int deleteProductRequirementByProductRequirementId(Long productRequirementId)
    {
        return productRequirementMapper.deleteProductRequirementByProductRequirementId(productRequirementId);
    }
}

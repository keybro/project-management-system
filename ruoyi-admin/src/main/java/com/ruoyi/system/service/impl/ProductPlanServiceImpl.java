package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProductPlanMapper;
import com.ruoyi.system.domain.ProductPlan;
import com.ruoyi.system.service.IProductPlanService;

/**
 * 产品计划列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-08
 */
@Service
public class ProductPlanServiceImpl implements IProductPlanService 
{
    @Autowired
    private ProductPlanMapper productPlanMapper;

    /**
     * 查询产品计划列表
     * 
     * @param panId 产品计划列表主键
     * @return 产品计划列表
     */
    @Override
    public ProductPlan selectProductPlanByPanId(Long panId)
    {
        return productPlanMapper.selectProductPlanByPanId(panId);
    }

    /**
     * 查询产品计划列表列表
     * 
     * @param productPlan 产品计划列表
     * @return 产品计划列表
     */
    @Override
    public List<ProductPlan> selectProductPlanList(ProductPlan productPlan)
    {
        return productPlanMapper.selectProductPlanList(productPlan);
    }

    /**
     * 新增产品计划列表
     * 
     * @param productPlan 产品计划列表
     * @return 结果
     */
    @Override
    public int insertProductPlan(ProductPlan productPlan)
    {
        return productPlanMapper.insertProductPlan(productPlan);
    }

    /**
     * 修改产品计划列表
     * 
     * @param productPlan 产品计划列表
     * @return 结果
     */
    @Override
    public int updateProductPlan(ProductPlan productPlan)
    {
        return productPlanMapper.updateProductPlan(productPlan);
    }

    /**
     * 批量删除产品计划列表
     * 
     * @param panIds 需要删除的产品计划列表主键
     * @return 结果
     */
    @Override
    public int deleteProductPlanByPanIds(Long[] panIds)
    {
        return productPlanMapper.deleteProductPlanByPanIds(panIds);
    }

    /**
     * 删除产品计划列表信息
     * 
     * @param panId 产品计划列表主键
     * @return 结果
     */
    @Override
    public int deleteProductPlanByPanId(Long panId)
    {
        return productPlanMapper.deleteProductPlanByPanId(panId);
    }
}

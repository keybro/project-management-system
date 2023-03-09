package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ProductPlan;

/**
 * 产品计划列表Service接口
 * 
 * @author lrj
 * @date 2023-03-08
 */
public interface IProductPlanService 
{
    /**
     * 查询产品计划列表
     * 
     * @param panId 产品计划列表主键
     * @return 产品计划列表
     */
    public ProductPlan selectProductPlanByPanId(Long panId);

    /**
     * 查询产品计划列表列表
     * 
     * @param productPlan 产品计划列表
     * @return 产品计划列表集合
     */
    public List<ProductPlan> selectProductPlanList(ProductPlan productPlan);

    /**
     * 新增产品计划列表
     * 
     * @param productPlan 产品计划列表
     * @return 结果
     */
    public int insertProductPlan(ProductPlan productPlan);

    /**
     * 修改产品计划列表
     * 
     * @param productPlan 产品计划列表
     * @return 结果
     */
    public int updateProductPlan(ProductPlan productPlan);

    /**
     * 批量删除产品计划列表
     * 
     * @param panIds 需要删除的产品计划列表主键集合
     * @return 结果
     */
    public int deleteProductPlanByPanIds(Long[] panIds);

    /**
     * 删除产品计划列表信息
     * 
     * @param panId 产品计划列表主键
     * @return 结果
     */
    public int deleteProductPlanByPanId(Long panId);
}

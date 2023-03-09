package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Product;

/**
 * 产品列表Service接口
 * 
 * @author lrj
 * @date 2023-03-08
 */
public interface IProductService 
{
    /**
     * 查询产品列表
     * 
     * @param productId 产品列表主键
     * @return 产品列表
     */
    public Product selectProductByProductId(Long productId);

    /**
     * 查询产品列表列表
     * 
     * @param product 产品列表
     * @return 产品列表集合
     */
    public List<Product> selectProductList(Product product);

    /**
     * 新增产品列表
     * 
     * @param product 产品列表
     * @return 结果
     */
    public int insertProduct(Product product);

    /**
     * 修改产品列表
     * 
     * @param product 产品列表
     * @return 结果
     */
    public int updateProduct(Product product);

    /**
     * 批量删除产品列表
     * 
     * @param productIds 需要删除的产品列表主键集合
     * @return 结果
     */
    public int deleteProductByProductIds(Long[] productIds);

    /**
     * 删除产品列表信息
     * 
     * @param productId 产品列表主键
     * @return 结果
     */
    public int deleteProductByProductId(Long productId);
}

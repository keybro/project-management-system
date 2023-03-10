package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ProductTest;

/**
 * 产品测试Mapper接口
 * 
 * @author lrj
 * @date 2023-03-10
 */
public interface ProductTestMapper 
{
    /**
     * 查询产品测试
     * 
     * @param productId 产品测试主键
     * @return 产品测试
     */
    public ProductTest selectProductTestByProductId(Long productId);

    /**
     * 查询产品测试列表
     * 
     * @param productTest 产品测试
     * @return 产品测试集合
     */
    public List<ProductTest> selectProductTestList(ProductTest productTest);

    /**
     * 新增产品测试
     * 
     * @param productTest 产品测试
     * @return 结果
     */
    public int insertProductTest(ProductTest productTest);

    /**
     * 修改产品测试
     * 
     * @param productTest 产品测试
     * @return 结果
     */
    public int updateProductTest(ProductTest productTest);

    /**
     * 删除产品测试
     * 
     * @param productId 产品测试主键
     * @return 结果
     */
    public int deleteProductTestByProductId(Long productId);

    /**
     * 批量删除产品测试
     * 
     * @param productIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductTestByProductIds(Long[] productIds);
}

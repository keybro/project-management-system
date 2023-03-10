package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProductTestMapper;
import com.ruoyi.system.domain.ProductTest;
import com.ruoyi.system.service.IProductTestService;

/**
 * 产品测试Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-10
 */
@Service
public class ProductTestServiceImpl implements IProductTestService 
{
    @Autowired
    private ProductTestMapper productTestMapper;

    /**
     * 查询产品测试
     * 
     * @param productId 产品测试主键
     * @return 产品测试
     */
    @Override
    public ProductTest selectProductTestByProductId(Long productId)
    {
        return productTestMapper.selectProductTestByProductId(productId);
    }

    /**
     * 查询产品测试列表
     * 
     * @param productTest 产品测试
     * @return 产品测试
     */
    @Override
    public List<ProductTest> selectProductTestList(ProductTest productTest)
    {
        return productTestMapper.selectProductTestList(productTest);
    }

    /**
     * 新增产品测试
     * 
     * @param productTest 产品测试
     * @return 结果
     */
    @Override
    public int insertProductTest(ProductTest productTest)
    {
        return productTestMapper.insertProductTest(productTest);
    }

    /**
     * 修改产品测试
     * 
     * @param productTest 产品测试
     * @return 结果
     */
    @Override
    public int updateProductTest(ProductTest productTest)
    {
        return productTestMapper.updateProductTest(productTest);
    }

    /**
     * 批量删除产品测试
     * 
     * @param productIds 需要删除的产品测试主键
     * @return 结果
     */
    @Override
    public int deleteProductTestByProductIds(Long[] productIds)
    {
        return productTestMapper.deleteProductTestByProductIds(productIds);
    }

    /**
     * 删除产品测试信息
     * 
     * @param productId 产品测试主键
     * @return 结果
     */
    @Override
    public int deleteProductTestByProductId(Long productId)
    {
        return productTestMapper.deleteProductTestByProductId(productId);
    }
}

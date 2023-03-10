package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.productBugMapper;
import com.ruoyi.system.domain.productBug;
import com.ruoyi.system.service.IproductBugService;

/**
 * 产品bug列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-10
 */
@Service
public class productBugServiceImpl implements IproductBugService 
{
    @Autowired
    private productBugMapper productBugMapper;

    /**
     * 查询产品bug列表
     * 
     * @param bugId 产品bug列表主键
     * @return 产品bug列表
     */
    @Override
    public productBug selectproductBugByBugId(Long bugId)
    {
        return productBugMapper.selectproductBugByBugId(bugId);
    }

    /**
     * 查询产品bug列表列表
     * 
     * @param productBug 产品bug列表
     * @return 产品bug列表
     */
    @Override
    public List<productBug> selectproductBugList(productBug productBug)
    {
        return productBugMapper.selectproductBugList(productBug);
    }

    /**
     * 新增产品bug列表
     * 
     * @param productBug 产品bug列表
     * @return 结果
     */
    @Override
    public int insertproductBug(productBug productBug)
    {
        return productBugMapper.insertproductBug(productBug);
    }

    /**
     * 修改产品bug列表
     * 
     * @param productBug 产品bug列表
     * @return 结果
     */
    @Override
    public int updateproductBug(productBug productBug)
    {
        return productBugMapper.updateproductBug(productBug);
    }

    /**
     * 批量删除产品bug列表
     * 
     * @param bugIds 需要删除的产品bug列表主键
     * @return 结果
     */
    @Override
    public int deleteproductBugByBugIds(Long[] bugIds)
    {
        return productBugMapper.deleteproductBugByBugIds(bugIds);
    }

    /**
     * 删除产品bug列表信息
     * 
     * @param bugId 产品bug列表主键
     * @return 结果
     */
    @Override
    public int deleteproductBugByBugId(Long bugId)
    {
        return productBugMapper.deleteproductBugByBugId(bugId);
    }
}

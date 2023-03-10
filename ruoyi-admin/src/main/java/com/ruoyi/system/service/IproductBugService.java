package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.productBug;

/**
 * 产品bug列表Service接口
 * 
 * @author lrj
 * @date 2023-03-10
 */
public interface IproductBugService 
{
    /**
     * 查询产品bug列表
     * 
     * @param bugId 产品bug列表主键
     * @return 产品bug列表
     */
    public productBug selectproductBugByBugId(Long bugId);

    /**
     * 查询产品bug列表列表
     * 
     * @param productBug 产品bug列表
     * @return 产品bug列表集合
     */
    public List<productBug> selectproductBugList(productBug productBug);

    /**
     * 新增产品bug列表
     * 
     * @param productBug 产品bug列表
     * @return 结果
     */
    public int insertproductBug(productBug productBug);

    /**
     * 修改产品bug列表
     * 
     * @param productBug 产品bug列表
     * @return 结果
     */
    public int updateproductBug(productBug productBug);

    /**
     * 批量删除产品bug列表
     * 
     * @param bugIds 需要删除的产品bug列表主键集合
     * @return 结果
     */
    public int deleteproductBugByBugIds(Long[] bugIds);

    /**
     * 删除产品bug列表信息
     * 
     * @param bugId 产品bug列表主键
     * @return 结果
     */
    public int deleteproductBugByBugId(Long bugId);
}

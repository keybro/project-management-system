package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ItemSet;

/**
 * 项目集Mapper接口
 * 
 * @author lrj
 * @date 2023-03-08
 */
public interface ItemSetMapper 
{
    /**
     * 查询项目集
     * 
     * @param itemSetId 项目集主键
     * @return 项目集
     */
    public ItemSet selectItemSetByItemSetId(Long itemSetId);

    /**
     * 查询项目集列表
     * 
     * @param itemSet 项目集
     * @return 项目集集合
     */
    public List<ItemSet> selectItemSetList(ItemSet itemSet);

    /**
     * 新增项目集
     * 
     * @param itemSet 项目集
     * @return 结果
     */
    public int insertItemSet(ItemSet itemSet);

    /**
     * 修改项目集
     * 
     * @param itemSet 项目集
     * @return 结果
     */
    public int updateItemSet(ItemSet itemSet);

    /**
     * 删除项目集
     * 
     * @param itemSetId 项目集主键
     * @return 结果
     */
    public int deleteItemSetByItemSetId(Long itemSetId);

    /**
     * 批量删除项目集
     * 
     * @param itemSetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteItemSetByItemSetIds(Long[] itemSetIds);
}

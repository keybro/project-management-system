package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ItemSetMapper;
import com.ruoyi.system.domain.ItemSet;
import com.ruoyi.system.service.IItemSetService;

/**
 * 项目集Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-08
 */
@Service
public class ItemSetServiceImpl implements IItemSetService 
{
    @Autowired
    private ItemSetMapper itemSetMapper;

    /**
     * 查询项目集
     * 
     * @param itemSetId 项目集主键
     * @return 项目集
     */
    @Override
    public ItemSet selectItemSetByItemSetId(Long itemSetId)
    {
        return itemSetMapper.selectItemSetByItemSetId(itemSetId);
    }

    /**
     * 查询项目集列表
     * 
     * @param itemSet 项目集
     * @return 项目集
     */
    @Override
    public List<ItemSet> selectItemSetList(ItemSet itemSet)
    {
        return itemSetMapper.selectItemSetList(itemSet);
    }

    /**
     * 新增项目集
     * 
     * @param itemSet 项目集
     * @return 结果
     */
    @Override
    public int insertItemSet(ItemSet itemSet)
    {
        return itemSetMapper.insertItemSet(itemSet);
    }

    /**
     * 修改项目集
     * 
     * @param itemSet 项目集
     * @return 结果
     */
    @Override
    public int updateItemSet(ItemSet itemSet)
    {
        return itemSetMapper.updateItemSet(itemSet);
    }

    /**
     * 批量删除项目集
     * 
     * @param itemSetIds 需要删除的项目集主键
     * @return 结果
     */
    @Override
    public int deleteItemSetByItemSetIds(Long[] itemSetIds)
    {
        return itemSetMapper.deleteItemSetByItemSetIds(itemSetIds);
    }

    /**
     * 删除项目集信息
     * 
     * @param itemSetId 项目集主键
     * @return 结果
     */
    @Override
    public int deleteItemSetByItemSetId(Long itemSetId)
    {
        return itemSetMapper.deleteItemSetByItemSetId(itemSetId);
    }
}

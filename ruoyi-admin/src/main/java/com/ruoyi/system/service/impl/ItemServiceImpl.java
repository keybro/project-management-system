package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ItemMapper;
import com.ruoyi.system.domain.Item;
import com.ruoyi.system.service.IItemService;

/**
 * 项目列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-08
 */
@Service
public class ItemServiceImpl implements IItemService 
{
    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询项目列表
     * 
     * @param itemId 项目列表主键
     * @return 项目列表
     */
    @Override
    public Item selectItemByItemId(Long itemId)
    {
        return itemMapper.selectItemByItemId(itemId);
    }

    /**
     * 查询项目列表列表
     * 
     * @param item 项目列表
     * @return 项目列表
     */
    @Override
    public List<Item> selectItemList(Item item)
    {
        return itemMapper.selectItemList(item);
    }

    /**
     * 新增项目列表
     * 
     * @param item 项目列表
     * @return 结果
     */
    @Override
    public int insertItem(Item item)
    {
        return itemMapper.insertItem(item);
    }

    /**
     * 修改项目列表
     * 
     * @param item 项目列表
     * @return 结果
     */
    @Override
    public int updateItem(Item item)
    {
        return itemMapper.updateItem(item);
    }

    /**
     * 批量删除项目列表
     * 
     * @param itemIds 需要删除的项目列表主键
     * @return 结果
     */
    @Override
    public int deleteItemByItemIds(Long[] itemIds)
    {
        return itemMapper.deleteItemByItemIds(itemIds);
    }

    /**
     * 删除项目列表信息
     * 
     * @param itemId 项目列表主键
     * @return 结果
     */
    @Override
    public int deleteItemByItemId(Long itemId)
    {
        return itemMapper.deleteItemByItemId(itemId);
    }
}

package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Item;

/**
 * 项目列表Service接口
 * 
 * @author lrj
 * @date 2023-03-08
 */
public interface IItemService 
{
    /**
     * 查询项目列表
     * 
     * @param itemId 项目列表主键
     * @return 项目列表
     */
    public Item selectItemByItemId(Long itemId);

    /**
     * 查询项目列表列表
     * 
     * @param item 项目列表
     * @return 项目列表集合
     */
    public List<Item> selectItemList(Item item);

    /**
     * 新增项目列表
     * 
     * @param item 项目列表
     * @return 结果
     */
    public int insertItem(Item item);

    /**
     * 修改项目列表
     * 
     * @param item 项目列表
     * @return 结果
     */
    public int updateItem(Item item);

    /**
     * 批量删除项目列表
     * 
     * @param itemIds 需要删除的项目列表主键集合
     * @return 结果
     */
    public int deleteItemByItemIds(Long[] itemIds);

    /**
     * 删除项目列表信息
     * 
     * @param itemId 项目列表主键
     * @return 结果
     */
    public int deleteItemByItemId(Long itemId);
}

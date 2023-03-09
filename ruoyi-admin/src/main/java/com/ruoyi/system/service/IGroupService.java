package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Group;

/**
 * 团队列表Service接口
 * 
 * @author lrj
 * @date 2023-03-09
 */
public interface IGroupService 
{
    /**
     * 查询团队列表
     * 
     * @param groupId 团队列表主键
     * @return 团队列表
     */
    public Group selectGroupByGroupId(Long groupId);

    /**
     * 查询团队列表列表
     * 
     * @param group 团队列表
     * @return 团队列表集合
     */
    public List<Group> selectGroupList(Group group);

    /**
     * 新增团队列表
     * 
     * @param group 团队列表
     * @return 结果
     */
    public int insertGroup(Group group);

    /**
     * 修改团队列表
     * 
     * @param group 团队列表
     * @return 结果
     */
    public int updateGroup(Group group);

    /**
     * 批量删除团队列表
     * 
     * @param groupIds 需要删除的团队列表主键集合
     * @return 结果
     */
    public int deleteGroupByGroupIds(Long[] groupIds);

    /**
     * 删除团队列表信息
     * 
     * @param groupId 团队列表主键
     * @return 结果
     */
    public int deleteGroupByGroupId(Long groupId);
}

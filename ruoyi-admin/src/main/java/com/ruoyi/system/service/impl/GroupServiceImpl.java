package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GroupMapper;
import com.ruoyi.system.domain.Group;
import com.ruoyi.system.service.IGroupService;

/**
 * 团队列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-09
 */
@Service
public class GroupServiceImpl implements IGroupService 
{
    @Autowired
    private GroupMapper groupMapper;

    /**
     * 查询团队列表
     * 
     * @param groupId 团队列表主键
     * @return 团队列表
     */
    @Override
    public Group selectGroupByGroupId(Long groupId)
    {
        return groupMapper.selectGroupByGroupId(groupId);
    }

    /**
     * 查询团队列表列表
     * 
     * @param group 团队列表
     * @return 团队列表
     */
    @Override
    public List<Group> selectGroupList(Group group)
    {
        return groupMapper.selectGroupList(group);
    }

    /**
     * 新增团队列表
     * 
     * @param group 团队列表
     * @return 结果
     */
    @Override
    public int insertGroup(Group group)
    {
        return groupMapper.insertGroup(group);
    }

    /**
     * 修改团队列表
     * 
     * @param group 团队列表
     * @return 结果
     */
    @Override
    public int updateGroup(Group group)
    {
        return groupMapper.updateGroup(group);
    }

    /**
     * 批量删除团队列表
     * 
     * @param groupIds 需要删除的团队列表主键
     * @return 结果
     */
    @Override
    public int deleteGroupByGroupIds(Long[] groupIds)
    {
        return groupMapper.deleteGroupByGroupIds(groupIds);
    }

    /**
     * 删除团队列表信息
     * 
     * @param groupId 团队列表主键
     * @return 结果
     */
    @Override
    public int deleteGroupByGroupId(Long groupId)
    {
        return groupMapper.deleteGroupByGroupId(groupId);
    }
}

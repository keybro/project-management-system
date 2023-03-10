package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BugMapper;
import com.ruoyi.system.domain.Bug;
import com.ruoyi.system.service.IBugService;

/**
 * bug列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-09
 */
@Service
public class BugServiceImpl implements IBugService 
{
    @Autowired
    private BugMapper bugMapper;

    /**
     * 查询bug列表
     * 
     * @param bugId bug列表主键
     * @return bug列表
     */
    @Override
    public Bug selectBugByBugId(Long bugId)
    {
        return bugMapper.selectBugByBugId(bugId);
    }

    /**
     * 查询bug列表列表
     * 
     * @param bug bug列表
     * @return bug列表
     */
    @Override
    public List<Bug> selectBugList(Bug bug)
    {
        return bugMapper.selectBugList(bug);
    }

    /**
     * 新增bug列表
     * 
     * @param bug bug列表
     * @return 结果
     */
    @Override
    public int insertBug(Bug bug)
    {
        return bugMapper.insertBug(bug);
    }

    /**
     * 修改bug列表
     * 
     * @param bug bug列表
     * @return 结果
     */
    @Override
    public int updateBug(Bug bug)
    {
        return bugMapper.updateBug(bug);
    }

    /**
     * 批量删除bug列表
     * 
     * @param bugIds 需要删除的bug列表主键
     * @return 结果
     */
    @Override
    public int deleteBugByBugIds(Long[] bugIds)
    {
        return bugMapper.deleteBugByBugIds(bugIds);
    }

    /**
     * 删除bug列表信息
     * 
     * @param bugId bug列表主键
     * @return 结果
     */
    @Override
    public int deleteBugByBugId(Long bugId)
    {
        return bugMapper.deleteBugByBugId(bugId);
    }
}

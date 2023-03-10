package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GExeMapper;
import com.ruoyi.system.domain.GExe;
import com.ruoyi.system.service.IGExeService;

/**
 * 执行团队Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-09
 */
@Service
public class GExeServiceImpl implements IGExeService 
{
    @Autowired
    private GExeMapper gExeMapper;

    /**
     * 查询执行团队
     * 
     * @param groupId 执行团队主键
     * @return 执行团队
     */
    @Override
    public GExe selectGExeByGroupId(Long groupId)
    {
        return gExeMapper.selectGExeByGroupId(groupId);
    }

    /**
     * 查询执行团队列表
     * 
     * @param gExe 执行团队
     * @return 执行团队
     */
    @Override
    public List<GExe> selectGExeList(GExe gExe)
    {
        return gExeMapper.selectGExeList(gExe);
    }

    /**
     * 新增执行团队
     * 
     * @param gExe 执行团队
     * @return 结果
     */
    @Override
    public int insertGExe(GExe gExe)
    {
        return gExeMapper.insertGExe(gExe);
    }

    /**
     * 修改执行团队
     * 
     * @param gExe 执行团队
     * @return 结果
     */
    @Override
    public int updateGExe(GExe gExe)
    {
        return gExeMapper.updateGExe(gExe);
    }

    /**
     * 批量删除执行团队
     * 
     * @param groupIds 需要删除的执行团队主键
     * @return 结果
     */
    @Override
    public int deleteGExeByGroupIds(Long[] groupIds)
    {
        return gExeMapper.deleteGExeByGroupIds(groupIds);
    }

    /**
     * 删除执行团队信息
     * 
     * @param groupId 执行团队主键
     * @return 结果
     */
    @Override
    public int deleteGExeByGroupId(Long groupId)
    {
        return gExeMapper.deleteGExeByGroupId(groupId);
    }
}

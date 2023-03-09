package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ExecuteMapper;
import com.ruoyi.system.domain.Execute;
import com.ruoyi.system.service.IExecuteService;

/**
 * 执行列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-08
 */
@Service
public class ExecuteServiceImpl implements IExecuteService 
{
    @Autowired
    private ExecuteMapper executeMapper;

    /**
     * 查询执行列表
     * 
     * @param executeId 执行列表主键
     * @return 执行列表
     */
    @Override
    public Execute selectExecuteByExecuteId(Long executeId)
    {
        return executeMapper.selectExecuteByExecuteId(executeId);
    }

    /**
     * 查询执行列表列表
     * 
     * @param execute 执行列表
     * @return 执行列表
     */
    @Override
    public List<Execute> selectExecuteList(Execute execute)
    {
        return executeMapper.selectExecuteList(execute);
    }

    /**
     * 新增执行列表
     * 
     * @param execute 执行列表
     * @return 结果
     */
    @Override
    public int insertExecute(Execute execute)
    {
        return executeMapper.insertExecute(execute);
    }

    /**
     * 修改执行列表
     * 
     * @param execute 执行列表
     * @return 结果
     */
    @Override
    public int updateExecute(Execute execute)
    {
        return executeMapper.updateExecute(execute);
    }

    /**
     * 批量删除执行列表
     * 
     * @param executeIds 需要删除的执行列表主键
     * @return 结果
     */
    @Override
    public int deleteExecuteByExecuteIds(Long[] executeIds)
    {
        return executeMapper.deleteExecuteByExecuteIds(executeIds);
    }

    /**
     * 删除执行列表信息
     * 
     * @param executeId 执行列表主键
     * @return 结果
     */
    @Override
    public int deleteExecuteByExecuteId(Long executeId)
    {
        return executeMapper.deleteExecuteByExecuteId(executeId);
    }
}

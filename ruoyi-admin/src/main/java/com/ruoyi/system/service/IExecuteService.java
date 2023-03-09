package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Execute;

/**
 * 执行列表Service接口
 * 
 * @author lrj
 * @date 2023-03-08
 */
public interface IExecuteService 
{
    /**
     * 查询执行列表
     * 
     * @param executeId 执行列表主键
     * @return 执行列表
     */
    public Execute selectExecuteByExecuteId(Long executeId);

    /**
     * 查询执行列表列表
     * 
     * @param execute 执行列表
     * @return 执行列表集合
     */
    public List<Execute> selectExecuteList(Execute execute);

    /**
     * 新增执行列表
     * 
     * @param execute 执行列表
     * @return 结果
     */
    public int insertExecute(Execute execute);

    /**
     * 修改执行列表
     * 
     * @param execute 执行列表
     * @return 结果
     */
    public int updateExecute(Execute execute);

    /**
     * 批量删除执行列表
     * 
     * @param executeIds 需要删除的执行列表主键集合
     * @return 结果
     */
    public int deleteExecuteByExecuteIds(Long[] executeIds);

    /**
     * 删除执行列表信息
     * 
     * @param executeId 执行列表主键
     * @return 结果
     */
    public int deleteExecuteByExecuteId(Long executeId);
}

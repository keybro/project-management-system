package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GExe;

/**
 * 执行团队Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-09
 */
public interface GExeMapper 
{
    /**
     * 查询执行团队
     * 
     * @param groupId 执行团队主键
     * @return 执行团队
     */
    public GExe selectGExeByGroupId(Long groupId);

    /**
     * 查询执行团队列表
     * 
     * @param gExe 执行团队
     * @return 执行团队集合
     */
    public List<GExe> selectGExeList(GExe gExe);

    /**
     * 新增执行团队
     * 
     * @param gExe 执行团队
     * @return 结果
     */
    public int insertGExe(GExe gExe);

    /**
     * 修改执行团队
     * 
     * @param gExe 执行团队
     * @return 结果
     */
    public int updateGExe(GExe gExe);

    /**
     * 删除执行团队
     * 
     * @param groupId 执行团队主键
     * @return 结果
     */
    public int deleteGExeByGroupId(Long groupId);

    /**
     * 批量删除执行团队
     * 
     * @param groupIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGExeByGroupIds(Long[] groupIds);
}

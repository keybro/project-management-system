package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Bug;

/**
 * bug列表Mapper接口
 * 
 * @author lrj
 * @date 2023-03-09
 */
public interface BugMapper 
{
    /**
     * 查询bug列表
     * 
     * @param bugId bug列表主键
     * @return bug列表
     */
    public Bug selectBugByBugId(Long bugId);

    /**
     * 查询bug列表列表
     * 
     * @param bug bug列表
     * @return bug列表集合
     */
    public List<Bug> selectBugList(Bug bug);

    /**
     * 新增bug列表
     * 
     * @param bug bug列表
     * @return 结果
     */
    public int insertBug(Bug bug);

    /**
     * 修改bug列表
     * 
     * @param bug bug列表
     * @return 结果
     */
    public int updateBug(Bug bug);

    /**
     * 删除bug列表
     * 
     * @param bugId bug列表主键
     * @return 结果
     */
    public int deleteBugByBugId(Long bugId);

    /**
     * 批量删除bug列表
     * 
     * @param bugIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBugByBugIds(Long[] bugIds);
}

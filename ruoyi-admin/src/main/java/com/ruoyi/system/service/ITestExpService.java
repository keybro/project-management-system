package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TestExp;

/**
 * 测试列表Service接口
 * 
 * @author lrj
 * @date 2023-03-09
 */
public interface ITestExpService 
{
    /**
     * 查询测试列表
     * 
     * @param testId 测试列表主键
     * @return 测试列表
     */
    public TestExp selectTestExpByTestId(Long testId);

    /**
     * 查询测试列表列表
     * 
     * @param testExp 测试列表
     * @return 测试列表集合
     */
    public List<TestExp> selectTestExpList(TestExp testExp);

    /**
     * 新增测试列表
     * 
     * @param testExp 测试列表
     * @return 结果
     */
    public int insertTestExp(TestExp testExp);

    /**
     * 修改测试列表
     * 
     * @param testExp 测试列表
     * @return 结果
     */
    public int updateTestExp(TestExp testExp);

    /**
     * 批量删除测试列表
     * 
     * @param testIds 需要删除的测试列表主键集合
     * @return 结果
     */
    public int deleteTestExpByTestIds(Long[] testIds);

    /**
     * 删除测试列表信息
     * 
     * @param testId 测试列表主键
     * @return 结果
     */
    public int deleteTestExpByTestId(Long testId);
}

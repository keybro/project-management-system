package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestExpMapper;
import com.ruoyi.system.domain.TestExp;
import com.ruoyi.system.service.ITestExpService;

/**
 * 测试列表Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-09
 */
@Service
public class TestExpServiceImpl implements ITestExpService 
{
    @Autowired
    private TestExpMapper testExpMapper;

    /**
     * 查询测试列表
     * 
     * @param testId 测试列表主键
     * @return 测试列表
     */
    @Override
    public TestExp selectTestExpByTestId(Long testId)
    {
        return testExpMapper.selectTestExpByTestId(testId);
    }

    /**
     * 查询测试列表列表
     * 
     * @param testExp 测试列表
     * @return 测试列表
     */
    @Override
    public List<TestExp> selectTestExpList(TestExp testExp)
    {
        return testExpMapper.selectTestExpList(testExp);
    }

    /**
     * 新增测试列表
     * 
     * @param testExp 测试列表
     * @return 结果
     */
    @Override
    public int insertTestExp(TestExp testExp)
    {
        return testExpMapper.insertTestExp(testExp);
    }

    /**
     * 修改测试列表
     * 
     * @param testExp 测试列表
     * @return 结果
     */
    @Override
    public int updateTestExp(TestExp testExp)
    {
        return testExpMapper.updateTestExp(testExp);
    }

    /**
     * 批量删除测试列表
     * 
     * @param testIds 需要删除的测试列表主键
     * @return 结果
     */
    @Override
    public int deleteTestExpByTestIds(Long[] testIds)
    {
        return testExpMapper.deleteTestExpByTestIds(testIds);
    }

    /**
     * 删除测试列表信息
     * 
     * @param testId 测试列表主键
     * @return 结果
     */
    @Override
    public int deleteTestExpByTestId(Long testId)
    {
        return testExpMapper.deleteTestExpByTestId(testId);
    }
}

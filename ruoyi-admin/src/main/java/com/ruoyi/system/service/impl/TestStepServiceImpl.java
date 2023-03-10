package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestStepMapper;
import com.ruoyi.system.domain.TestStep;
import com.ruoyi.system.service.ITestStepService;

/**
 * 测试步骤Service业务层处理
 * 
 * @author lrj
 * @date 2023-03-10
 */
@Service
public class TestStepServiceImpl implements ITestStepService 
{
    @Autowired
    private TestStepMapper testStepMapper;

    /**
     * 查询测试步骤
     * 
     * @param stepId 测试步骤主键
     * @return 测试步骤
     */
    @Override
    public TestStep selectTestStepByStepId(Long stepId)
    {
        return testStepMapper.selectTestStepByStepId(stepId);
    }

    /**
     * 查询测试步骤列表
     * 
     * @param testStep 测试步骤
     * @return 测试步骤
     */
    @Override
    public List<TestStep> selectTestStepList(TestStep testStep)
    {
        return testStepMapper.selectTestStepList(testStep);
    }

    /**
     * 新增测试步骤
     * 
     * @param testStep 测试步骤
     * @return 结果
     */
    @Override
    public int insertTestStep(TestStep testStep)
    {
        return testStepMapper.insertTestStep(testStep);
    }

    /**
     * 修改测试步骤
     * 
     * @param testStep 测试步骤
     * @return 结果
     */
    @Override
    public int updateTestStep(TestStep testStep)
    {
        return testStepMapper.updateTestStep(testStep);
    }

    /**
     * 批量删除测试步骤
     * 
     * @param stepIds 需要删除的测试步骤主键
     * @return 结果
     */
    @Override
    public int deleteTestStepByStepIds(Long[] stepIds)
    {
        return testStepMapper.deleteTestStepByStepIds(stepIds);
    }

    /**
     * 删除测试步骤信息
     * 
     * @param stepId 测试步骤主键
     * @return 结果
     */
    @Override
    public int deleteTestStepByStepId(Long stepId)
    {
        return testStepMapper.deleteTestStepByStepId(stepId);
    }
}

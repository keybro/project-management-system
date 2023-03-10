package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TestStep;

/**
 * 测试步骤Service接口
 * 
 * @author lrj
 * @date 2023-03-10
 */
public interface ITestStepService 
{
    /**
     * 查询测试步骤
     * 
     * @param stepId 测试步骤主键
     * @return 测试步骤
     */
    public TestStep selectTestStepByStepId(Long stepId);

    /**
     * 查询测试步骤列表
     * 
     * @param testStep 测试步骤
     * @return 测试步骤集合
     */
    public List<TestStep> selectTestStepList(TestStep testStep);

    /**
     * 新增测试步骤
     * 
     * @param testStep 测试步骤
     * @return 结果
     */
    public int insertTestStep(TestStep testStep);

    /**
     * 修改测试步骤
     * 
     * @param testStep 测试步骤
     * @return 结果
     */
    public int updateTestStep(TestStep testStep);

    /**
     * 批量删除测试步骤
     * 
     * @param stepIds 需要删除的测试步骤主键集合
     * @return 结果
     */
    public int deleteTestStepByStepIds(Long[] stepIds);

    /**
     * 删除测试步骤信息
     * 
     * @param stepId 测试步骤主键
     * @return 结果
     */
    public int deleteTestStepByStepId(Long stepId);
}

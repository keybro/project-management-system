package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 团队列表对象 group
 * 
 * @author lrj
 * @date 2023-03-09
 */
public class Group extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 执行团队id */
    private Long groupId;

    /** 成员id */
    @Excel(name = "成员id")
    private Long memberId;

    /** 用户职位 */
    @Excel(name = "用户职位")
    private Long memberPosition;

    /** 加盟时间 */
    @Excel(name = "加盟时间")
    private String joinDate;

    public void setGroupId(Long groupId) 
    {
        this.groupId = groupId;
    }

    public Long getGroupId() 
    {
        return groupId;
    }
    public void setMemberId(Long memberId) 
    {
        this.memberId = memberId;
    }

    public Long getMemberId() 
    {
        return memberId;
    }
    public void setMemberPosition(Long memberPosition) 
    {
        this.memberPosition = memberPosition;
    }

    public Long getMemberPosition() 
    {
        return memberPosition;
    }
    public void setJoinDate(String joinDate) 
    {
        this.joinDate = joinDate;
    }

    public String getJoinDate() 
    {
        return joinDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("groupId", getGroupId())
            .append("memberId", getMemberId())
            .append("memberPosition", getMemberPosition())
            .append("joinDate", getJoinDate())
            .toString();
    }
}

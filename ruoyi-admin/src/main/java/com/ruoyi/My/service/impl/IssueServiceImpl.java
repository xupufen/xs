package com.ruoyi.My.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.My.mapper.IssueMapper;
import com.ruoyi.My.domain.Issue;
import com.ruoyi.My.service.IIssueService;

/**
 * 信息管理Service业务层处理
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
@Service
public class IssueServiceImpl implements IIssueService 
{
    @Resource
    private IssueMapper issueMapper;

    /**
     * 查询信息管理
     * 
     * @param id 信息管理主键
     * @return 信息管理
     */
    @Override
    public Issue selectIssueById(Long id)
    {
        return issueMapper.selectIssueById(id);
    }

    /**
     * 查询信息管理列表
     * 
     * @param issue 信息管理
     * @return 信息管理
     */
    @Override
    public List<Issue> selectIssueList(Issue issue)
    {
        return issueMapper.selectIssueList(issue);
    }

    /**
     * 新增信息管理
     * 
     * @param issue 信息管理
     * @return 结果
     */
    @Override
    public int insertIssue(Issue issue)
    {
        return issueMapper.insertIssue(issue);
    }

    /**
     * 修改信息管理
     * 
     * @param issue 信息管理
     * @return 结果
     */
    @Override
    public int updateIssue(Issue issue)
    {
        return issueMapper.updateIssue(issue);
    }

    /**
     * 批量删除信息管理
     * 
     * @param ids 需要删除的信息管理主键
     * @return 结果
     */
    @Override
    public int deleteIssueByIds(Long[] ids)
    {
        return issueMapper.deleteIssueByIds(ids);
    }

    /**
     * 删除信息管理信息
     * 
     * @param id 信息管理主键
     * @return 结果
     */
    @Override
    public int deleteIssueById(Long id)
    {
        return issueMapper.deleteIssueById(id);
    }
}

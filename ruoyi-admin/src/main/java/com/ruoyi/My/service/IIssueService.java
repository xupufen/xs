package com.ruoyi.My.service;

import java.util.List;
import com.ruoyi.My.domain.Issue;

/**
 * 信息管理Service接口
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
public interface IIssueService 
{
    /**
     * 查询信息管理
     * 
     * @param id 信息管理主键
     * @return 信息管理
     */
    public Issue selectIssueById(Long id);

    /**
     * 查询信息管理列表
     * 
     * @param issue 信息管理
     * @return 信息管理集合
     */
    public List<Issue> selectIssueList(Issue issue);

    /**
     * 新增信息管理
     * 
     * @param issue 信息管理
     * @return 结果
     */
    public int insertIssue(Issue issue);

    /**
     * 修改信息管理
     * 
     * @param issue 信息管理
     * @return 结果
     */
    public int updateIssue(Issue issue);

    /**
     * 批量删除信息管理
     * 
     * @param ids 需要删除的信息管理主键集合
     * @return 结果
     */
    public int deleteIssueByIds(Long[] ids);

    /**
     * 删除信息管理信息
     * 
     * @param id 信息管理主键
     * @return 结果
     */
    public int deleteIssueById(Long id);
}

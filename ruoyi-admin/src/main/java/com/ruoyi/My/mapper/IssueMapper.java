package com.ruoyi.My.mapper;

import java.util.List;
import com.ruoyi.My.domain.Issue;

/**
 * 用户积分管理Mapper接口
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
public interface IssueMapper 
{
    /**
     * 查询用户积分管理
     * 
     * @param id 用户积分管理主键
     * @return 用户积分管理
     */
    public Issue selectIssueById(Long id);

    /**
     * 查询用户积分管理列表
     * 
     * @param issue 用户积分管理
     * @return 用户积分管理集合
     */
    public List<Issue> selectIssueList(Issue issue);

    /**
     * 新增用户积分管理
     * 
     * @param issue 用户积分管理
     * @return 结果
     */
    public int insertIssue(Issue issue);

    /**
     * 修改用户积分管理
     * 
     * @param issue 用户积分管理
     * @return 结果
     */
    public int updateIssue(Issue issue);

    /**
     * 删除用户积分管理
     * 
     * @param id 用户积分管理主键
     * @return 结果
     */
    public int deleteIssueById(Long id);

    /**
     * 批量删除用户积分管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIssueByIds(Long[] ids);
}

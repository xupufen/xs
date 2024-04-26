package com.ruoyi.My.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.Anonymous;
import org.springframework.security.access.prepost.PreAuthorize;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.My.domain.Issue;
import com.ruoyi.My.service.IIssueService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户积分管理Controller
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
@Anonymous
@RestController
@RequestMapping("/issue/issue")
public class IssueController extends BaseController
{
    @Resource
    private IIssueService issueService;

    /**
     * 查询用户积分管理列表
     */

//    @PreAuthorize("@ss.hasPermi('issue:issue:list')")
    @GetMapping("/list")
    public TableDataInfo list(Issue issue)
    {
        startPage();
        List<Issue> list = issueService.selectIssueList(issue);
        return getDataTable(list);
    }

    /**
     * 导出用户积分管理列表
     */
    @PreAuthorize("@ss.hasPermi('issue:issue:export')")
    @Log(title = "用户积分管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Issue issue)
    {
        List<Issue> list = issueService.selectIssueList(issue);
        ExcelUtil<Issue> util = new ExcelUtil<Issue>(Issue.class);
        util.exportExcel(response, list, "用户积分管理数据");
    }

    /**
     * 获取用户积分管理详细用户积分
     */
    @PreAuthorize("@ss.hasPermi('issue:issue:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(issueService.selectIssueById(id));
    }

    /**
     * 新增用户积分管理
     */
    @PreAuthorize("@ss.hasPermi('issue:issue:add')")
    @Log(title = "用户积分管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Issue issue)
    {
        return toAjax(issueService.insertIssue(issue));
    }

    /**
     * 修改用户积分管理
     */
    @PreAuthorize("@ss.hasPermi('issue:issue:edit')")
    @Log(title = "用户积分管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Issue issue)
    {
        return toAjax(issueService.updateIssue(issue));
    }

    /**
     * 删除用户积分管理
     */
    @PreAuthorize("@ss.hasPermi('issue:issue:remove')")
    @Log(title = "用户积分管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(issueService.deleteIssueByIds(ids));
    }
}

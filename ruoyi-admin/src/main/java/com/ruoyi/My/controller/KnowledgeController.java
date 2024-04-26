package com.ruoyi.My.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.ruoyi.common.annotation.Anonymous;
import org.springframework.security.access.prepost.PreAuthorize;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.My.domain.Knowledge;
import com.ruoyi.My.service.IKnowledgeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 环保信息管理Controller
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/My/knowledge")
public class KnowledgeController extends BaseController
{
    @Resource
    private IKnowledgeService knowledgeService;

    /**
     * 查询信息管理列表
     */
    @Anonymous
//    @PreAuthorize("@ss.hasPermi('My:knowledge:list')")
    @GetMapping("/list")
    public TableDataInfo list(Knowledge knowledge)
    {
        startPage();
        List<Knowledge> list = knowledgeService.selectKnowledgeList(knowledge);
        return getDataTable(list);
    }

    /**
     * 导出信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('My:knowledge:export')")
    @Log(title = "信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Knowledge knowledge)
    {
        List<Knowledge> list = knowledgeService.selectKnowledgeList(knowledge);
        ExcelUtil<Knowledge> util = new ExcelUtil<Knowledge>(Knowledge.class);
        util.exportExcel(response, list, "信息管理数据");
    }

    /**
     * 获取信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('My:knowledge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(knowledgeService.selectKnowledgeById(id));
    }

    /**
     * 新增信息管理
     */
    @PreAuthorize("@ss.hasPermi('My:knowledge:add')")
    @Log(title = "信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Knowledge knowledge)
    {
        return toAjax(knowledgeService.insertKnowledge(knowledge));
    }

    /**
     * 修改信息管理
     */
    @PreAuthorize("@ss.hasPermi('My:knowledge:edit')")
    @Log(title = "信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Knowledge knowledge)
    {
        return toAjax(knowledgeService.updateKnowledge(knowledge));
    }

    /**
     * 删除信息管理
     */
    @PreAuthorize("@ss.hasPermi('My:knowledge:remove')")
    @Log(title = "信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(knowledgeService.deleteKnowledgeByIds(ids));
    }
}

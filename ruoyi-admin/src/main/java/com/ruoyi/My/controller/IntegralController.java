package com.ruoyi.My.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.My.domain.Integral;
import com.ruoyi.My.service.IIntegralService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户积分Controller
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
@RestController
@RequestMapping("/integral/integral")
public class IntegralController extends BaseController
{
    @Resource
    private IIntegralService integralService;

    /**
     * 查询用户积分列表
     */
    @PreAuthorize("@ss.hasPermi('integral:integral:list')")
    @GetMapping("/list")
    public TableDataInfo list(Integral integral)
    {
        startPage();
        List<Integral> list = integralService.selectIntegralList(integral);
        return getDataTable(list);
    }

    /**
     * 导出用户积分列表
     */
    @PreAuthorize("@ss.hasPermi('integral:integral:export')")
    @Log(title = "用户积分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Integral integral)
    {
        List<Integral> list = integralService.selectIntegralList(integral);
        ExcelUtil<Integral> util = new ExcelUtil<Integral>(Integral.class);
        util.exportExcel(response, list, "用户积分数据");
    }

    /**
     * 获取用户积分详细信息
     */
    @PreAuthorize("@ss.hasPermi('integral:integral:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(integralService.selectIntegralById(id));
    }

    /**
     * 新增用户积分
     */
    @PreAuthorize("@ss.hasPermi('integral:integral:add')")
    @Log(title = "用户积分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Integral integral)
    {
        return toAjax(integralService.insertIntegral(integral));
    }

    /**
     * 修改用户积分
     */
    @PreAuthorize("@ss.hasPermi('integral:integral:edit')")
    @Log(title = "用户积分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Integral integral)
    {
        return toAjax(integralService.updateIntegral(integral));
    }

    /**
     * 删除用户积分
     */
    @PreAuthorize("@ss.hasPermi('integral:integral:remove')")
    @Log(title = "用户积分", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(integralService.deleteIntegralByIds(ids));
    }
}

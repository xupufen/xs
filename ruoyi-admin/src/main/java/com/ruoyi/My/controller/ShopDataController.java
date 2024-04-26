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
import com.ruoyi.My.domain.ShopData;
import com.ruoyi.My.service.IShopDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品总信息管理Controller
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/My/My")
public class ShopDataController extends BaseController
{
    @Resource
    private IShopDataService shopDataService;

    /**
     * 查询总信息管理列表
     */
//    @PreAuthorize("@ss.hasPermi('My:My:list')")
    @Anonymous //不需token验证
    @GetMapping("/list")
    public TableDataInfo list(ShopData shopData)
    {
        startPage();
        List<ShopData> list = shopDataService.selectShopDataList(shopData);
        return getDataTable(list);
    }

    /**
     * 导出总信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('My:My:export')")
    @Log(title = "总信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShopData shopData)
    {
        List<ShopData> list = shopDataService.selectShopDataList(shopData);
        ExcelUtil<ShopData> util = new ExcelUtil<ShopData>(ShopData.class);
        util.exportExcel(response, list, "总信息管理数据");
    }

    /**
     * 获取总信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('My:My:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(shopDataService.selectShopDataById(id));
    }

    /**
     * 新增总信息管理
     */
    @PreAuthorize("@ss.hasPermi('My:My:add')")
    @Log(title = "总信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShopData shopData)
    {
        return toAjax(shopDataService.insertShopData(shopData));
    }

    /**
     * 修改总信息管理
     */
    @PreAuthorize("@ss.hasPermi('My:My:edit')")
    @Log(title = "总信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShopData shopData)
    {
        return toAjax(shopDataService.updateShopData(shopData));
    }

    /**
     * 删除总信息管理
     */
    @PreAuthorize("@ss.hasPermi('My:My:remove')")
    @Log(title = "总信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(shopDataService.deleteShopDataByIds(ids));
    }
}

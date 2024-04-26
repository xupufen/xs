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
import com.ruoyi.My.domain.UserShop;
import com.ruoyi.My.service.IUserShopService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户订单Controller
 * 
 * @author 徐朴芬
 * @date 2024-04-17
 */
@RestController
@RequestMapping("/My/usershop")
public class UserShopController extends BaseController
{
    @Resource
    private IUserShopService userShopService;

    /**
     * 查询用户订单列表
     */

    @PreAuthorize("@ss.hasPermi('My:usershop:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserShop userShop)
    {
        startPage();
        List<UserShop> list = userShopService.selectUserShopList(userShop);
        return getDataTable(list);
    }

    /**
     * 导出用户订单列表
     */
    @PreAuthorize("@ss.hasPermi('My:usershop:export')")
    @Log(title = "用户订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserShop userShop)
    {
        List<UserShop> list = userShopService.selectUserShopList(userShop);
        ExcelUtil<UserShop> util = new ExcelUtil<UserShop>(UserShop.class);
        util.exportExcel(response, list, "用户订单数据");
    }

    /**
     * 获取用户订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('My:usershop:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userShopService.selectUserShopById(id));
    }


    /**
     * 获取当前用户订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('My:usershop:query')")
    @GetMapping(value = "/user/{userid}")
    public AjaxResult getUserInfo(@PathVariable("userid") Long userid)
    {
        return success(userShopService.selectpresentUserShopById(userid));
    }

    /**
     * 新增用户订单
     */
    @PreAuthorize("@ss.hasPermi('My:usershop:add')")
    @Log(title = "用户订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserShop userShop)
    {
        return toAjax(userShopService.insertUserShop(userShop));
    }

    /**
     * 修改用户订单
     */
    @PreAuthorize("@ss.hasPermi('My:usershop:edit')")
    @Log(title = "用户订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserShop userShop)
    {
        return toAjax(userShopService.updateUserShop(userShop));
    }

    /**
     * 删除用户订单
     */
    @PreAuthorize("@ss.hasPermi('My:usershop:remove')")
    @Log(title = "用户订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userShopService.deleteUserShopByIds(ids));
    }
}

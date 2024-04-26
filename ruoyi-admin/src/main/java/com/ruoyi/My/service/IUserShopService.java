package com.ruoyi.My.service;

import java.util.List;
import com.ruoyi.My.domain.UserShop;

/**
 * 用户订单Service接口
 * 
 * @author 徐朴芬
 * @date 2024-04-17
 */
public interface IUserShopService 
{
    /**
     * 查询用户订单
     * 
     * @param id 用户订单主键
     * @return 用户订单
     */
    public UserShop selectUserShopById(Long id);

    /**
     * 查询当前用户订单
     *
     * @param userid 用户订单主键
     * @return 用户订单
     */
    public List<UserShop> selectpresentUserShopById(Long userid);

    /**
     * 查询用户订单列表
     * 
     * @param userShop 用户订单
     * @return 用户订单集合
     */
    public List<UserShop> selectUserShopList(UserShop userShop);

    /**
     * 新增用户订单
     * 
     * @param userShop 用户订单
     * @return 结果
     */
    public int insertUserShop(UserShop userShop);

    /**
     * 修改用户订单
     * 
     * @param userShop 用户订单
     * @return 结果
     */
    public int updateUserShop(UserShop userShop);

    /**
     * 批量删除用户订单
     * 
     * @param ids 需要删除的用户订单主键集合
     * @return 结果
     */
    public int deleteUserShopByIds(Long[] ids);

    /**
     * 删除用户订单信息
     * 
     * @param id 用户订单主键
     * @return 结果
     */
    public int deleteUserShopById(Long id);
}

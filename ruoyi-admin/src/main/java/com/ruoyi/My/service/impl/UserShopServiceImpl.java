package com.ruoyi.My.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.My.mapper.UserShopMapper;
import com.ruoyi.My.domain.UserShop;
import com.ruoyi.My.service.IUserShopService;

/**
 * 用户订单Service业务层处理
 * 
 * @author 徐朴芬
 * @date 2024-04-17
 */
@Service
public class UserShopServiceImpl implements IUserShopService 
{
    @Resource
    private UserShopMapper userShopMapper;

    /**
     * 查询用户订单
     * 
     * @param id 用户订单主键
     * @return 用户订单
     */
    @Override
    public UserShop selectUserShopById(Long id)
    {
        return userShopMapper.selectUserShopById(id);
    }

    /**
     * 查询当前用户订单
     *
     * @param userid 用户订单主键
     * @return 用户订单
     */
    @Override
    public List<UserShop> selectpresentUserShopById(Long userid) {
        return userShopMapper.selectpresentUserShopById(userid);
    }

    /**
     * 查询用户订单列表
     * 
     * @param userShop 用户订单
     * @return 用户订单
     */
    @Override
    public List<UserShop> selectUserShopList(UserShop userShop)
    {
        return userShopMapper.selectUserShopList(userShop);
    }

    /**
     * 新增用户订单
     * 
     * @param userShop 用户订单
     * @return 结果
     */
    @Override
    public int insertUserShop(UserShop userShop)
    {
        return userShopMapper.insertUserShop(userShop);
    }

    /**
     * 修改用户订单
     * 
     * @param userShop 用户订单
     * @return 结果
     */
    @Override
    public int updateUserShop(UserShop userShop)
    {
        return userShopMapper.updateUserShop(userShop);
    }

    /**
     * 批量删除用户订单
     * 
     * @param ids 需要删除的用户订单主键
     * @return 结果
     */
    @Override
    public int deleteUserShopByIds(Long[] ids)
    {
        return userShopMapper.deleteUserShopByIds(ids);
    }

    /**
     * 删除用户订单信息
     * 
     * @param id 用户订单主键
     * @return 结果
     */
    @Override
    public int deleteUserShopById(Long id)
    {
        return userShopMapper.deleteUserShopById(id);
    }
}

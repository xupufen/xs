package com.ruoyi.My.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.My.mapper.ShopDataMapper;
import com.ruoyi.My.domain.ShopData;
import com.ruoyi.My.service.IShopDataService;

import javax.annotation.Resource;

/**
 * 商品总信息管理Service业务层处理
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
@Service
public class ShopDataServiceImpl implements IShopDataService 
{
    @Resource
    private ShopDataMapper shopDataMapper;
    
    /**
     * 查询总信息管理
     * 
     * @param id 总信息管理主键
     * @return 总信息管理
     */
    @Override
    public ShopData selectShopDataById(Long id)
    {
        return shopDataMapper.selectShopDataById(id);
    }

    /**
     * 查询总信息管理列表
     * 
     * @param shopData 总信息管理
     * @return 总信息管理
     */
    @Override
    public List<ShopData> selectShopDataList(ShopData shopData)
    {
        return shopDataMapper.selectShopDataList(shopData);
    }

    /**
     * 新增总信息管理
     * 
     * @param shopData 总信息管理
     * @return 结果
     */
    @Override
    public int insertShopData(ShopData shopData)
    {
        return shopDataMapper.insertShopData(shopData);
    }

    /**
     * 修改总信息管理
     * 
     * @param shopData 总信息管理
     * @return 结果
     */
    @Override
    public int updateShopData(ShopData shopData)
    {
        return shopDataMapper.updateShopData(shopData);
    }

    /**
     * 批量删除总信息管理
     * 
     * @param ids 需要删除的总信息管理主键
     * @return 结果
     */
    @Override
    public int deleteShopDataByIds(Long[] ids)
    {
        return shopDataMapper.deleteShopDataByIds(ids);
    }

    /**
     * 删除总信息管理信息
     * 
     * @param id 总信息管理主键
     * @return 结果
     */
    @Override
    public int deleteShopDataById(Long id)
    {
        return shopDataMapper.deleteShopDataById(id);
    }
}

package com.ruoyi.My.service;

import java.util.List;
import com.ruoyi.My.domain.ShopData;

/**
 * 商品总信息管理Service接口
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
public interface IShopDataService 
{
    /**
     * 查询总信息管理
     * 
     * @param id 总信息管理主键
     * @return 总信息管理
     */
    public ShopData selectShopDataById(Long id);

    /**
     * 查询总信息管理列表
     * 
     * @param shopData 总信息管理
     * @return 总信息管理集合
     */
    public List<ShopData> selectShopDataList(ShopData shopData);

    /**
     * 新增总信息管理
     * 
     * @param shopData 总信息管理
     * @return 结果
     */
    public int insertShopData(ShopData shopData);

    /**
     * 修改总信息管理
     * 
     * @param shopData 总信息管理
     * @return 结果
     */
    public int updateShopData(ShopData shopData);

    /**
     * 批量删除总信息管理
     * 
     * @param ids 需要删除的总信息管理主键集合
     * @return 结果
     */
    public int deleteShopDataByIds(Long[] ids);

    /**
     * 删除总信息管理信息
     * 
     * @param id 总信息管理主键
     * @return 结果
     */
    public int deleteShopDataById(Long id);
}

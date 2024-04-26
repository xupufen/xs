package com.ruoyi.My.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户订单对象 user_shop
 * @author 徐朴芬
 * @date 2024-04-17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserShop extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 购买用户 */
    @Excel(name = "购买用户")
    private String userName;

    /** 商品id */
    @Excel(name = "商品id")
    private Long shopId;

    /** 购买商品*/
    @Excel(name = "所购商品")
    private String shopName;

    /**商品图片*/
    private String imgs;

    /** 购买数量 */
    @Excel(name = "购买数量")
    private Long shopNum;

    /** 总价 */
    @Excel(name = "总价")
    private String sum;

    /** 收货地址 */
    @Excel(name = "收货地址")
    private String addres;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String shopStat;
}

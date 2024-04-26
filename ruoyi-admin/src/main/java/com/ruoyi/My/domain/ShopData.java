package com.ruoyi.My.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品总信息管理对象 shop_data
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
public class ShopData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 商品id */
    @Excel(name = "商品id")
    private Long shopId;

    /** 商品名 */
    @Excel(name = "商品名")
    private String shopName;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal shopPrice;

    /** 商品库存 */
    @Excel(name = "商品库存")
    private String shopSum;

    /** 商品状态 */
    @Excel(name = "商品状态")
    private String shopStart;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String shopData;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String shopImgs;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setShopId(Long shopId) 
    {
        this.shopId = shopId;
    }

    public Long getShopId() 
    {
        return shopId;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }
    public void setShopPrice(BigDecimal shopPrice) 
    {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getShopPrice() 
    {
        return shopPrice;
    }
    public void setShopSum(String shopSum) 
    {
        this.shopSum = shopSum;
    }

    public String getShopSum() 
    {
        return shopSum;
    }
    public void setShopStart(String shopStart) 
    {
        this.shopStart = shopStart;
    }

    public String getShopStart() 
    {
        return shopStart;
    }
    public void setShopData(String shopData) 
    {
        this.shopData = shopData;
    }

    public String getShopData() 
    {
        return shopData;
    }
    public void setShopImgs(String shopImgs) 
    {
        this.shopImgs = shopImgs;
    }

    public String getShopImgs() 
    {
        return shopImgs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("shopName", getShopName())
            .append("shopPrice", getShopPrice())
            .append("shopSum", getShopSum())
            .append("shopStart", getShopStart())
            .append("shopData", getShopData())
            .append("shopImgs", getShopImgs())
            .toString();
    }
}

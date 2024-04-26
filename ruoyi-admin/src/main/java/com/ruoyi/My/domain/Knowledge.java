package com.ruoyi.My.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 环保信息管理对象 knowledge
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
public class Knowledge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 内容id */
    @Excel(name = "内容id")
    private Long dataId;

    /** 环保标题 */
    @Excel(name = "环保标题")
    private String title;

    /** 环保内容 */
    @Excel(name = "环保内容")
    private String datas;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 用户评论 */
    @Excel(name = "用户评论")
    private String comment;

    /** 环保图片 */
    @Excel(name = "环保图片")
    private String imgs;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDataId(Long dataId) 
    {
        this.dataId = dataId;
    }

    public Long getDataId() 
    {
        return dataId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setDatas(String datas) 
    {
        this.datas = datas;
    }

    public String getDatas() 
    {
        return datas;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setImgs(String imgs) 
    {
        this.imgs = imgs;
    }

    public String getImgs() 
    {
        return imgs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dataId", getDataId())
            .append("title", getTitle())
            .append("datas", getDatas())
            .append("userId", getUserId())
            .append("comment", getComment())
            .append("imgs", getImgs())
            .toString();
    }
}

package com.ruoyi.My.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户积分管理对象 issue
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
public class Issue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 问题标题 */
    @Excel(name = "问题标题")
    private String title;

    /** 问题内容 */
    @Excel(name = "问题内容")
    private String issuebody;

    /** 显示状态 */
    @Excel(name = "显示状态")
    private Boolean start;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setIssuebody(String issuebody) 
    {
        this.issuebody = issuebody;
    }

    public String getIssuebody() 
    {
        return issuebody;
    }
    public void setStart(Boolean start) 
    {
        this.start = start;
    }

    public Boolean getStart() 
    {
        return start;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("issuebody", getIssuebody())
            .append("start", getStart())
            .toString();
    }
}

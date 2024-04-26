package com.ruoyi.My.domain;

/**
 * 查询用户头像
 */
public class headportrait {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = "http://172.18.58.29:8081"+url;
    }

    public headportrait(String url) {
        this.url = url;
    }

    public headportrait() {
    }

    @Override
    public String toString() {
        return "headportraitmapper{" +
                "url='" + url + '\'' +
                '}';
    }
}

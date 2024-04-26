package com.ruoyi.My.mapper;

import java.util.List;
import com.ruoyi.My.domain.Knowledge;
import com.ruoyi.My.domain.headportrait;
import org.apache.ibatis.annotations.Param;

/**
 * 环保信息管理Mapper接口
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
public interface KnowledgeMapper 
{
    /**
     * 查询信息管理
     * 
     * @param id 信息管理主键
     * @return 信息管理
     */
    public Knowledge selectKnowledgeById(Long id);

    /**
     * 查询信息管理列表
     * 
     * @param knowledge 信息管理
     * @return 信息管理集合
     */
    public List<Knowledge> selectKnowledgeList(Knowledge knowledge);

    /**
     * 新增信息管理
     * 
     * @param knowledge 信息管理
     * @return 结果
     */
    public int insertKnowledge(Knowledge knowledge);

    /**
     * 修改信息管理
     * 
     * @param knowledge 信息管理
     * @return 结果
     */
    public int updateKnowledge(Knowledge knowledge);

    /**
     * 删除信息管理
     * 
     * @param id 信息管理主键
     * @return 结果
     */
    public int deleteKnowledgeById(Long id);

    /**
     * 批量删除信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKnowledgeByIds(Long[] ids);


    /**
     * 查询用户头像接口
     */
    public headportrait ByUserName(@Param("username") String username);
}

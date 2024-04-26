package com.ruoyi.My.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.My.mapper.KnowledgeMapper;
import com.ruoyi.My.domain.Knowledge;
import com.ruoyi.My.service.IKnowledgeService;

/**
 * 环保信息管理Service业务层处理
 * 
 * @author 徐朴芬
 * @date 2024-04-15
 */
@Service
public class KnowledgeServiceImpl implements IKnowledgeService 
{
    @Resource
    private KnowledgeMapper knowledgeMapper;

    /**
     * 查询信息管理
     * 
     * @param id 信息管理主键
     * @return 信息管理
     */
    @Override
    public Knowledge selectKnowledgeById(Long id)
    {
        return knowledgeMapper.selectKnowledgeById(id);
    }

    /**
     * 查询信息管理列表
     * 
     * @param knowledge 信息管理
     * @return 信息管理
     */
    @Override
    public List<Knowledge> selectKnowledgeList(Knowledge knowledge)
    {
        return knowledgeMapper.selectKnowledgeList(knowledge);
    }

    /**
     * 新增信息管理
     * 
     * @param knowledge 信息管理
     * @return 结果
     */
    @Override
    public int insertKnowledge(Knowledge knowledge)
    {
        return knowledgeMapper.insertKnowledge(knowledge);
    }

    /**
     * 修改信息管理
     * 
     * @param knowledge 信息管理
     * @return 结果
     */
    @Override
    public int updateKnowledge(Knowledge knowledge)
    {
        return knowledgeMapper.updateKnowledge(knowledge);
    }

    /**
     * 批量删除信息管理
     * 
     * @param ids 需要删除的信息管理主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeByIds(Long[] ids)
    {
        return knowledgeMapper.deleteKnowledgeByIds(ids);
    }

    /**
     * 删除信息管理信息
     * 
     * @param id 信息管理主键
     * @return 结果
     */
    @Override
    public int deleteKnowledgeById(Long id)
    {
        return knowledgeMapper.deleteKnowledgeById(id);
    }

    /**
     * 通过username获取用户头像
     *
     * @param username
     * @return
     */
    @Override
    public Object ByUserName(String username) {
       if (knowledgeMapper.ByUserName(username)!=null){
           return knowledgeMapper.ByUserName(username);
       }else {
           return null;
       }
    }

}

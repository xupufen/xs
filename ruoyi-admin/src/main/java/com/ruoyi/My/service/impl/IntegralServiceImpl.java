package com.ruoyi.My.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.My.mapper.IntegralMapper;
import com.ruoyi.My.domain.Integral;
import com.ruoyi.My.service.IIntegralService;

/**
 * 用户积分Service业务层处理
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
@Service
public class IntegralServiceImpl implements IIntegralService 
{
    @Resource
    private IntegralMapper integralMapper;

    /**
     * 查询用户积分
     * 
     * @param id 用户积分主键
     * @return 用户积分
     */
    @Override
    public Integral selectIntegralById(Long id)
    {
        return integralMapper.selectIntegralById(id);
    }

    /**
     * 查询用户积分列表
     * 
     * @param integral 用户积分
     * @return 用户积分
     */
    @Override
    public List<Integral> selectIntegralList(Integral integral)
    {
        return integralMapper.selectIntegralList(integral);
    }

    /**
     * 新增用户积分
     * 
     * @param integral 用户积分
     * @return 结果
     */
    @Override
    public int insertIntegral(Integral integral)
    {
        return integralMapper.insertIntegral(integral);
    }

    /**
     * 修改用户积分
     * 
     * @param integral 用户积分
     * @return 结果
     */
    @Override
    public int updateIntegral(Integral integral)
    {
        return integralMapper.updateIntegral(integral);
    }

    /**
     * 批量删除用户积分
     * 
     * @param ids 需要删除的用户积分主键
     * @return 结果
     */
    @Override
    public int deleteIntegralByIds(Long[] ids)
    {
        return integralMapper.deleteIntegralByIds(ids);
    }

    /**
     * 删除用户积分信息
     * 
     * @param id 用户积分主键
     * @return 结果
     */
    @Override
    public int deleteIntegralById(Long id)
    {
        return integralMapper.deleteIntegralById(id);
    }
}

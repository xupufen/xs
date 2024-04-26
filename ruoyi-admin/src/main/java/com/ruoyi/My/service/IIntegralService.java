package com.ruoyi.My.service;

import java.util.List;
import com.ruoyi.My.domain.Integral;

/**
 * 用户积分Service接口
 * 
 * @author 徐朴芬
 * @date 2024-04-25
 */
public interface IIntegralService 
{
    /**
     * 查询用户积分
     * 
     * @param id 用户积分主键
     * @return 用户积分
     */
    public Integral selectIntegralById(Long id);

    /**
     * 查询用户积分列表
     * 
     * @param integral 用户积分
     * @return 用户积分集合
     */
    public List<Integral> selectIntegralList(Integral integral);

    /**
     * 新增用户积分
     * 
     * @param integral 用户积分
     * @return 结果
     */
    public int insertIntegral(Integral integral);

    /**
     * 修改用户积分
     * 
     * @param integral 用户积分
     * @return 结果
     */
    public int updateIntegral(Integral integral);

    /**
     * 批量删除用户积分
     * 
     * @param ids 需要删除的用户积分主键集合
     * @return 结果
     */
    public int deleteIntegralByIds(Long[] ids);

    /**
     * 删除用户积分信息
     * 
     * @param id 用户积分主键
     * @return 结果
     */
    public int deleteIntegralById(Long id);
}

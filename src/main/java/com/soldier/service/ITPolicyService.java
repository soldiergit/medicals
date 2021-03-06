package com.soldier.service;

import com.soldier.domain.TPolicy;

import java.util.List;

/**
 * 政策Service接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface ITPolicyService {
    /**
     * 查询政策
     *
     * @param runyear 政策ID
     * @return 政策
     */
    public TPolicy selectTPolicyById(String runyear);

    /**
     * 查询政策列表
     *
     * @param tPolicy 政策
     * @return 政策集合
     */
    public List<TPolicy> selectTPolicyList(TPolicy tPolicy);

    /**
     * 新增政策
     *
     * @param tPolicy 政策
     * @return 结果
     */
    public int insertTPolicy(TPolicy tPolicy);

    /**
     * 修改政策
     *
     * @param tPolicy 政策
     * @return 结果
     */
    public int updateTPolicy(TPolicy tPolicy);

    /**
     * 批量删除政策
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTPolicyByIds(String ids);

    /**
     * 删除政策信息
     *
     * @param runyear 政策ID
     * @return 结果
     */
    public int deleteTPolicyById(String runyear);
}

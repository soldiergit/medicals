package com.soldier.mapper;

import com.soldier.domain.TPayperiod;

import java.util.List;

/**
 * 期限Mapper接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface TPayperiodMapper {
    /**
     * 查询期限
     *
     * @param runyear 期限ID
     * @return 期限
     */
    public TPayperiod selectTPayperiodById(Long runyear);

    /**
     * 查询期限列表
     *
     * @param tPayperiod 期限
     * @return 期限集合
     */
    public List<TPayperiod> selectTPayperiodList(TPayperiod tPayperiod);

    /**
     * 新增期限
     *
     * @param tPayperiod 期限
     * @return 结果
     */
    public int insertTPayperiod(TPayperiod tPayperiod);

    /**
     * 修改期限
     *
     * @param tPayperiod 期限
     * @return 结果
     */
    public int updateTPayperiod(TPayperiod tPayperiod);

    /**
     * 删除期限
     *
     * @param runyear 期限ID
     * @return 结果
     */
    public int deleteTPayperiodById(Long runyear);

    /**
     * 批量删除期限
     *
     * @param runyears 需要删除的数据ID
     * @return 结果
     */
    public int deleteTPayperiodByIds(String[] runyears);
}

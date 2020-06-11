package com.soldier.service;

import com.soldier.domain.TReducttreat;

import java.util.List;

/**
 * 还原处理Service接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface ITReducttreatService {
    /**
     * 查询还原处理
     *
     * @param id 还原处理ID
     * @return 还原处理
     */
    public TReducttreat selectTReducttreatById(Long id);

    /**
     * 查询还原处理列表
     *
     * @param tReducttreat 还原处理
     * @return 还原处理集合
     */
    public List<TReducttreat> selectTReducttreatList(TReducttreat tReducttreat);

    /**
     * 新增还原处理
     *
     * @param tReducttreat 还原处理
     * @return 结果
     */
    public int insertTReducttreat(TReducttreat tReducttreat);

    /**
     * 修改还原处理
     *
     * @param tReducttreat 还原处理
     * @return 结果
     */
    public int updateTReducttreat(TReducttreat tReducttreat);

    /**
     * 批量删除还原处理
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTReducttreatByIds(String ids);

    /**
     * 删除还原处理信息
     *
     * @param id 还原处理ID
     * @return 结果
     */
    public int deleteTReducttreatById(Long id);
}

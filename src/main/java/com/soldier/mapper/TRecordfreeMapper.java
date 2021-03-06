package com.soldier.mapper;

import com.soldier.domain.TRecordfree;

import java.util.List;

/**
 * 记录Mapper接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface TRecordfreeMapper {
    /**
     * 查询记录
     *
     * @param perscode 记录ID
     * @return 记录
     */
    public TRecordfree selectTRecordfreeById(String perscode);

    /**
     * 查询记录列表
     *
     * @param tRecordfree 记录
     * @return 记录集合
     */
    public List<TRecordfree> selectTRecordfreeList(TRecordfree tRecordfree);

    /**
     * 新增记录
     *
     * @param tRecordfree 记录
     * @return 结果
     */
    public int insertTRecordfree(TRecordfree tRecordfree);

    /**
     * 修改记录
     *
     * @param tRecordfree 记录
     * @return 结果
     */
    public int updateTRecordfree(TRecordfree tRecordfree);

    /**
     * 删除记录
     *
     * @param perscode 记录ID
     * @return 结果
     */
    public int deleteTRecordfreeById(String perscode);

    /**
     * 批量删除记录
     *
     * @param perscodes 需要删除的数据ID
     * @return 结果
     */
    public int deleteTRecordfreeByIds(String[] perscodes);
}

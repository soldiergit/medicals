package com.soldier.service;

import com.soldier.domain.Reimburse;

import java.util.List;

/**
 * 报销Service接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 */
public interface IReimburseService {
    /**
     * 查询报销
     *
     * @param reiNo 报销ID
     * @return 报销
     */
    public Reimburse selectReimburseById(String reiNo);

    /**
     * 查询报销列表
     *
     * @param reimburse 报销
     * @return 报销集合
     */
    public List<Reimburse> selectReimburseList(Reimburse reimburse);

    /**
     * 新增报销
     *
     * @param reimburse 报销
     * @return 结果
     */
    public int insertReimburse(Reimburse reimburse);

    /**
     * 修改报销
     *
     * @param reimburse 报销
     * @return 结果
     */
    public int updateReimburse(Reimburse reimburse);

    /**
     * 批量删除报销
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteReimburseByIds(String ids);

    /**
     * 删除报销信息
     *
     * @param reiNo 报销ID
     * @return 结果
     */
    public int deleteReimburseById(String reiNo);
}

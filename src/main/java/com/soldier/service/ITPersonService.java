package com.soldier.service;

import com.soldier.domain.TPerson;

import java.util.List;

/**
 * 人Service接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface ITPersonService {
    /**
     * 查询人
     *
     * @param perscode 人ID
     * @return 人
     */
    public TPerson selectTPersonById(String perscode);


    /**
     * 查询身份证
     *
     * @param cardId 人ID
     * @return 人
     */
    public TPerson selectTPersonByCardId(String cardId);

    /**
     * 查询人列表
     *
     * @param tPerson 人
     * @return 人集合
     */
    public List<TPerson> selectTPersonList(TPerson tPerson);

    /**
     * 新增人
     *
     * @param tPerson 人
     * @return 结果
     */
    public int insertTPerson(TPerson tPerson);

    /**
     * 修改人
     *
     * @param tPerson 人
     * @return 结果
     */
    public int updateTPerson(TPerson tPerson);

    /**
     * 批量删除人
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTPersonByIds(String ids);

    /**
     * 删除人信息
     *
     * @param perscode 人ID
     * @return 结果
     */
    public int deleteTPersonById(String perscode);
}

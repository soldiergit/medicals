package com.soldier.mapper;

import com.soldier.domain.TFamily;

import java.util.List;

/**
 * 家庭档案Mapper接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface TFamilyMapper {
    /**
     * 查询家庭档案
     *
     * @param famicode 家庭档案ID
     * @return 家庭档案
     */
    public TFamily selectTFamilyById(String famicode);

    /**
     * 查询家庭档案列表
     *
     * @param tFamily 家庭档案
     * @return 家庭档案集合
     */
    public List<TFamily> selectTFamilyList(TFamily tFamily);

    /**
     * 新增家庭档案
     *
     * @param tFamily 家庭档案
     * @return 结果
     */
    public int insertTFamily(TFamily tFamily);

    /**
     * 修改家庭档案
     *
     * @param tFamily 家庭档案
     * @return 结果
     */
    public int updateTFamily(TFamily tFamily);

    /**
     * 删除家庭档案
     *
     * @param famicode 家庭档案ID
     * @return 结果
     */
    public int deleteTFamilyById(String famicode);

    /**
     * 批量删除家庭档案
     *
     * @param famicodes 需要删除的数据ID
     * @return 结果
     */
    public int deleteTFamilyByIds(String[] famicodes);
}

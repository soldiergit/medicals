package com.soldier.mapper;

import com.soldier.domain.TInstitution;

import java.util.List;

/**
 * 机构Mapper接口
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
public interface TInstitutionMapper {
    /**
     * 查询机构
     *
     * @param areacode 机构ID
     * @return 机构
     */
    public TInstitution selectTInstitutionById(String areacode);

    /**
     * 查询机构列表
     *
     * @param tInstitution 机构
     * @return 机构集合
     */
    public List<TInstitution> selectTInstitutionList(TInstitution tInstitution);

    /**
     * 新增机构
     *
     * @param tInstitution 机构
     * @return 结果
     */
    public int insertTInstitution(TInstitution tInstitution);

    /**
     * 修改机构
     *
     * @param tInstitution 机构
     * @return 结果
     */
    public int updateTInstitution(TInstitution tInstitution);

    /**
     * 删除机构
     *
     * @param areacode 机构ID
     * @return 结果
     */
    public int deleteTInstitutionById(String areacode);

    /**
     * 批量删除机构
     *
     * @param areacodes 需要删除的数据ID
     * @return 结果
     */
    public int deleteTInstitutionByIds(String[] areacodes);
}

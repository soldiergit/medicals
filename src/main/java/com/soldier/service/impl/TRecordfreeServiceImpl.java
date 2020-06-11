package com.soldier.service.impl;

import java.util.List;

import com.soldier.domain.TRecordfree;
import com.soldier.mapper.TRecordfreeMapper;
import com.soldier.service.ITRecordfreeService;
import com.soldier.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 记录Service业务层处理
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
@Service
public class TRecordfreeServiceImpl implements ITRecordfreeService {
    @Autowired
    private TRecordfreeMapper tRecordfreeMapper;

    /**
     * 查询记录
     *
     * @param perscode 记录ID
     * @return 记录
     */
    @Override
    public TRecordfree selectTRecordfreeById(String perscode) {
        return tRecordfreeMapper.selectTRecordfreeById(perscode);
    }

    /**
     * 查询记录列表
     *
     * @param tRecordfree 记录
     * @return 记录
     */
    @Override
    public List<TRecordfree> selectTRecordfreeList(TRecordfree tRecordfree) {
        return tRecordfreeMapper.selectTRecordfreeList(tRecordfree);
    }

    /**
     * 新增记录
     *
     * @param tRecordfree 记录
     * @return 结果
     */
    @Override
    public int insertTRecordfree(TRecordfree tRecordfree) {
        return tRecordfreeMapper.insertTRecordfree(tRecordfree);
    }

    /**
     * 修改记录
     *
     * @param tRecordfree 记录
     * @return 结果
     */
    @Override
    public int updateTRecordfree(TRecordfree tRecordfree) {
        return tRecordfreeMapper.updateTRecordfree(tRecordfree);
    }

    /**
     * 删除记录对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTRecordfreeByIds(String ids) {
        return tRecordfreeMapper.deleteTRecordfreeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除记录信息
     *
     * @param perscode 记录ID
     * @return 结果
     */
    @Override
    public int deleteTRecordfreeById(String perscode) {
        return tRecordfreeMapper.deleteTRecordfreeById(perscode);
    }
}

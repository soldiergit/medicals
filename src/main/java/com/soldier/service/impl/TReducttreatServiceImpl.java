package com.soldier.service.impl;

import java.util.List;

import com.soldier.domain.TReducttreat;
import com.soldier.mapper.TReducttreatMapper;
import com.soldier.service.ITReducttreatService;
import com.soldier.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 还原处理Service业务层处理
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
@Service
public class TReducttreatServiceImpl implements ITReducttreatService {
    @Autowired
    private TReducttreatMapper tReducttreatMapper;

    /**
     * 查询还原处理
     *
     * @param id 还原处理ID
     * @return 还原处理
     */
    @Override
    public TReducttreat selectTReducttreatById(Long id) {
        return tReducttreatMapper.selectTReducttreatById(id);
    }

    /**
     * 查询还原处理列表
     *
     * @param tReducttreat 还原处理
     * @return 还原处理
     */
    @Override
    public List<TReducttreat> selectTReducttreatList(TReducttreat tReducttreat) {
        return tReducttreatMapper.selectTReducttreatList(tReducttreat);
    }

    /**
     * 新增还原处理
     *
     * @param tReducttreat 还原处理
     * @return 结果
     */
    @Override
    public int insertTReducttreat(TReducttreat tReducttreat) {
        return tReducttreatMapper.insertTReducttreat(tReducttreat);
    }

    /**
     * 修改还原处理
     *
     * @param tReducttreat 还原处理
     * @return 结果
     */
    @Override
    public int updateTReducttreat(TReducttreat tReducttreat) {
        return tReducttreatMapper.updateTReducttreat(tReducttreat);
    }

    /**
     * 删除还原处理对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTReducttreatByIds(String ids) {
        return tReducttreatMapper.deleteTReducttreatByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除还原处理信息
     *
     * @param id 还原处理ID
     * @return 结果
     */
    @Override
    public int deleteTReducttreatById(Long id) {
        return tReducttreatMapper.deleteTReducttreatById(id);
    }
}

package com.soldier.service.impl;

import java.util.List;

import com.soldier.domain.TPayperiod;
import com.soldier.mapper.TPayperiodMapper;
import com.soldier.service.ITPayperiodService;
import com.soldier.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 期限Service业务层处理
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
@Service
public class TPayperiodServiceImpl implements ITPayperiodService {
    @Autowired
    private TPayperiodMapper tPayperiodMapper;

    /**
     * 查询期限
     *
     * @param runyear 期限ID
     * @return 期限
     */
    @Override
    public TPayperiod selectTPayperiodById(Long runyear) {
        return tPayperiodMapper.selectTPayperiodById(runyear);
    }

    /**
     * 查询期限列表
     *
     * @param tPayperiod 期限
     * @return 期限
     */
    @Override
    public List<TPayperiod> selectTPayperiodList(TPayperiod tPayperiod) {
        return tPayperiodMapper.selectTPayperiodList(tPayperiod);
    }

    /**
     * 新增期限
     *
     * @param tPayperiod 期限
     * @return 结果
     */
    @Override
    public int insertTPayperiod(TPayperiod tPayperiod) {
        return tPayperiodMapper.insertTPayperiod(tPayperiod);
    }

    /**
     * 修改期限
     *
     * @param tPayperiod 期限
     * @return 结果
     */
    @Override
    public int updateTPayperiod(TPayperiod tPayperiod) {
        return tPayperiodMapper.updateTPayperiod(tPayperiod);
    }

    /**
     * 删除期限对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTPayperiodByIds(String ids) {
        return tPayperiodMapper.deleteTPayperiodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除期限信息
     *
     * @param runyear 期限ID
     * @return 结果
     */
    @Override
    public int deleteTPayperiodById(Long runyear) {
        return tPayperiodMapper.deleteTPayperiodById(runyear);
    }
}

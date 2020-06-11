package com.soldier.service.impl;

import java.util.List;

import com.soldier.domain.TPayment;
import com.soldier.mapper.TPaymentMapper;
import com.soldier.service.ITPaymentService;
import com.soldier.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 付款Service业务层处理
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
@Service
public class TPaymentServiceImpl implements ITPaymentService {
    @Autowired
    private TPaymentMapper tPaymentMapper;

    /**
     * 查询付款
     *
     * @param payno 付款ID
     * @return 付款
     */
    @Override
    public TPayment selectTPaymentById(Long payno) {
        return tPaymentMapper.selectTPaymentById(payno);
    }

    /**
     * 查询付款列表
     *
     * @param tPayment 付款
     * @return 付款
     */
    @Override
    public List<TPayment> selectTPaymentList(TPayment tPayment) {
        return tPaymentMapper.selectTPaymentList(tPayment);
    }

    /**
     * 新增付款
     *
     * @param tPayment 付款
     * @return 结果
     */
    @Override
    public int insertTPayment(TPayment tPayment) {
        return tPaymentMapper.insertTPayment(tPayment);
    }

    /**
     * 修改付款
     *
     * @param tPayment 付款
     * @return 结果
     */
    @Override
    public int updateTPayment(TPayment tPayment) {
        return tPaymentMapper.updateTPayment(tPayment);
    }

    /**
     * 删除付款对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTPaymentByIds(String ids) {
        return tPaymentMapper.deleteTPaymentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除付款信息
     *
     * @param payno 付款ID
     * @return 结果
     */
    @Override
    public int deleteTPaymentById(Long payno) {
        return tPaymentMapper.deleteTPaymentById(payno);
    }
}

package com.soldier.service.impl;

import java.util.List;

import com.soldier.domain.Reimburse;
import com.soldier.mapper.ReimburseMapper;
import com.soldier.service.IReimburseService;
import com.soldier.utils.Convert;
import com.soldier.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 报销Service业务层处理
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 */
@Service
public class ReimburseServiceImpl implements IReimburseService {
    @Autowired
    private ReimburseMapper reimburseMapper;

    /**
     * 查询报销
     *
     * @param reiNo 报销ID
     * @return 报销
     */
    @Override
    public Reimburse selectReimburseById(String reiNo) {
        return reimburseMapper.selectReimburseById(reiNo);
    }

    /**
     * 查询报销列表
     *
     * @param reimburse 报销
     * @return 报销
     */
    @Override
    public List<Reimburse> selectReimburseList(Reimburse reimburse) {
        return reimburseMapper.selectReimburseList(reimburse);
    }

    /**
     * 新增报销
     *
     * @param reimburse 报销
     * @return 结果
     */
    @Override
    public int insertReimburse(Reimburse reimburse) {
        return reimburseMapper.insertReimburse(reimburse);
    }

    /**
     * 修改报销
     *
     * @param reimburse 报销
     * @return 结果
     */
    @Override
    public int updateReimburse(Reimburse reimburse) {
        reimburse.setUpdateTime(DateUtils.getNowDate());
        return reimburseMapper.updateReimburse(reimburse);
    }

    /**
     * 删除报销对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteReimburseByIds(String ids) {
        return reimburseMapper.deleteReimburseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除报销信息
     *
     * @param reiNo 报销ID
     * @return 结果
     */
    @Override
    public int deleteReimburseById(String reiNo) {
        return reimburseMapper.deleteReimburseById(reiNo);
    }
}

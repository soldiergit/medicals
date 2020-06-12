package com.soldier.service.impl;

import java.util.List;

import com.soldier.domain.TChronicdis;
import com.soldier.mapper.TChronicdisMapper;
import com.soldier.service.ITChronicdisService;
import com.soldier.utils.Convert;
import com.soldier.utils.UidCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 慢性病Service业务层处理
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-04
 */
@Service
public class TChronicdisServiceImpl implements ITChronicdisService {
    @Autowired
    private TChronicdisMapper tChronicdisMapper;

    /**
     * 查询慢性病
     *
     * @param illcode 慢性病ID
     * @return 慢性病
     */
    @Override
    public TChronicdis selectTChronicdisById(String illcode) {
        return tChronicdisMapper.selectTChronicdisById(illcode);
    }

    /**
     * 查询慢性病列表
     *
     * @param tChronicdis 慢性病
     * @return 慢性病
     */
    @Override
    public List<TChronicdis> selectTChronicdisList(TChronicdis tChronicdis) {
        return tChronicdisMapper.selectTChronicdisList(tChronicdis);
    }

    /**
     * 新增慢性病
     *
     * @param tChronicdis 慢性病
     * @return 结果
     */
    @Override
    public int insertTChronicdis(TChronicdis tChronicdis) {
        tChronicdis.setIllcode(UidCard.uidCard());
        return tChronicdisMapper.insertTChronicdis(tChronicdis);
    }

    /**
     * 修改慢性病
     *
     * @param tChronicdis 慢性病
     * @return 结果
     */
    @Override
    public int updateTChronicdis(TChronicdis tChronicdis) {
        return tChronicdisMapper.updateTChronicdis(tChronicdis);
    }

    /**
     * 删除慢性病对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTChronicdisByIds(String ids) {
        return tChronicdisMapper.deleteTChronicdisByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除慢性病信息
     *
     * @param illcode 慢性病ID
     * @return 结果
     */
    @Override
    public int deleteTChronicdisById(String illcode) {
        return tChronicdisMapper.deleteTChronicdisById(illcode);
    }
}

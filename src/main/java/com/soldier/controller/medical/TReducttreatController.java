package com.soldier.controller.medical;

import java.util.List;

import com.soldier.controller.BaseController;
import com.soldier.domain.TReducttreat;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.ITReducttreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:还原处理Controller
 */
@Controller
@RequestMapping("/medical/reducttreat")
public class TReducttreatController extends BaseController {
    private String prefix = "medical/reducttreat";

    @Autowired
    private ITReducttreatService tReducttreatService;

    @GetMapping()
    public String reducttreat() {
        return prefix + "/reducttreat";
    }

    /**
     * 查询还原处理列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TReducttreat tReducttreat) {
        startPage();
        List<TReducttreat> list = tReducttreatService.selectTReducttreatList(tReducttreat);
        return getDataTable(list);
    }


    /**
     * 新增还原处理
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存还原处理
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TReducttreat tReducttreat) {
        return toAjax(tReducttreatService.insertTReducttreat(tReducttreat));
    }

    /**
     * 修改还原处理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TReducttreat tReducttreat = tReducttreatService.selectTReducttreatById(id);
        mmap.put("tReducttreat", tReducttreat);
        return prefix + "/edit";
    }

    /**
     * 修改保存还原处理
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TReducttreat tReducttreat) {
        return toAjax(tReducttreatService.updateTReducttreat(tReducttreat));
    }

    /**
     * 删除还原处理
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tReducttreatService.deleteTReducttreatByIds(ids));
    }
}

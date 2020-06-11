package com.soldier.controller.medical;

import java.util.List;

import com.soldier.controller.BaseController;
import com.soldier.controller.RedisUtil;
import com.soldier.domain.TChronicinfo;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.ITChronicinfoService;
import com.soldier.utils.UidCard;
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
 * @Description:慢性信息Controller
 */
@Controller
@RequestMapping("/medical/chronicinfo")
public class TChronicinfoController extends BaseController {
    private String prefix = "medical/chronicinfo";

    @Autowired
    private ITChronicinfoService tChronicinfoService;

    @Autowired
    private RedisUtil redisUtil;


    @GetMapping()
    public String chronicinfo() {
        return prefix + "/chronicinfo";
    }

    /**
     * 查询慢性信息列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TChronicinfo tChronicinfo) {
        startPage();
        List<TChronicinfo> list = tChronicinfoService.selectTChronicinfoList(tChronicinfo);
        return getDataTable(list);
    }


    /**
     * 新增慢性信息
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存慢性信息
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TChronicinfo tChronicinfo) {
        String userName = redisUtil.get("userName").toString();
        tChronicinfo.setCreator(userName);
        tChronicinfo.setId("450" + UidCard.uidCard());
        return toAjax(tChronicinfoService.insertTChronicinfo(tChronicinfo));
    }

    /**
     * 修改慢性信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap) {
        TChronicinfo tChronicinfo = tChronicinfoService.selectTChronicinfoById(id);
        mmap.put("tChronicinfo", tChronicinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存慢性信息
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TChronicinfo tChronicinfo) {
        return toAjax(tChronicinfoService.updateTChronicinfo(tChronicinfo));
    }

    /**
     * 删除慢性信息
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tChronicinfoService.deleteTChronicinfoByIds(ids));
    }
}

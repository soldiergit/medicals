package com.soldier.controller.medical;

import java.util.List;

import com.soldier.controller.BaseController;
import com.soldier.domain.TChronicdis;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.ITChronicdisService;
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
 * @Description:慢性病Controller
 */
@Controller
@RequestMapping("/medical/chronicdis")
public class TChronicdisController extends BaseController {
    private String prefix = "medical/chronicdis";

    @Autowired
    private ITChronicdisService tChronicdisService;

    @GetMapping()
    public String chronicdis() {
        return prefix + "/chronicdis";
    }

    /**
     * 查询慢性病列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TChronicdis tChronicdis) {
        startPage();
        List<TChronicdis> list = tChronicdisService.selectTChronicdisList(tChronicdis);
        return getDataTable(list);
    }


    /**
     * 新增慢性病
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存慢性病
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TChronicdis tChronicdis) {
        return toAjax(tChronicdisService.insertTChronicdis(tChronicdis));
    }

    /**
     * 修改慢性病
     */
    @GetMapping("/edit/{illcode}")
    public String edit(@PathVariable("illcode") String illcode, ModelMap mmap) {
        TChronicdis tChronicdis = tChronicdisService.selectTChronicdisById(illcode);
        mmap.put("tChronicdis", tChronicdis);
        return prefix + "/edit";
    }

    /**
     * 修改保存慢性病
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TChronicdis tChronicdis) {
        return toAjax(tChronicdisService.updateTChronicdis(tChronicdis));
    }

    /**
     * 删除慢性病
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tChronicdisService.deleteTChronicdisByIds(ids));
    }
}

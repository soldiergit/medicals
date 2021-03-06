package com.soldier.controller.medical;

import java.util.List;

import com.soldier.controller.BaseController;
import com.soldier.domain.TMedical;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.ITMedicalService;
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
 * @Description:医疗Controller
 */
@Controller
@RequestMapping("/medical/medical")
public class TMedicalController extends BaseController {
    private String prefix = "medical/medical";

    @Autowired
    private ITMedicalService tMedicalService;

    @GetMapping()
    public String medical() {
        return prefix + "/medical";
    }

    /**
     * 查询医疗列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TMedical tMedical) {
        startPage();
        List<TMedical> list = tMedicalService.selectTMedicalList(tMedical);
        return getDataTable(list);
    }


    /**
     * 新增医疗
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存医疗
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TMedical tMedical) {
        return toAjax(tMedicalService.insertTMedical(tMedical));
    }

    /**
     * 修改医疗
     */
    @GetMapping("/edit/{jgbm}")
    public String edit(@PathVariable("jgbm") String jgbm, ModelMap mmap) {
        TMedical tMedical = tMedicalService.selectTMedicalById(jgbm);
        mmap.put("tMedical", tMedical);
        return prefix + "/edit";
    }

    /**
     * 修改保存医疗
     */

    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TMedical tMedical) {
        return toAjax(tMedicalService.updateTMedical(tMedical));
    }

    /**
     * 删除医疗
     */

    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tMedicalService.deleteTMedicalByIds(ids));
    }
}

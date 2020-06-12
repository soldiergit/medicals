package com.soldier.controller.medical;

import java.util.List;

import com.soldier.controller.BaseController;
import com.soldier.domain.TInstitution;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.ITInstitutionService;
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
 * @Description:机构Controller
 */
@Controller
@RequestMapping("/medical/institution")
public class TInstitutionController extends BaseController {
    private String prefix = "medical/institution";

    @Autowired
    private ITInstitutionService tInstitutionService;

    @GetMapping()
    public String institution() {
        return prefix + "/institution";
    }

    /**
     * 查询机构列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TInstitution tInstitution) {
        startPage();
        List<TInstitution> list = tInstitutionService.selectTInstitutionList(tInstitution);
        return getDataTable(list);
    }


    /**
     * 新增机构
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存机构
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TInstitution tInstitution) {
        return toAjax(tInstitutionService.insertTInstitution(tInstitution));
    }

    /**
     * 修改机构
     */
    @GetMapping("/edit/{areacode}")
    public String edit(@PathVariable("areacode") String areacode, ModelMap mmap) {
        TInstitution tInstitution = tInstitutionService.selectTInstitutionById(areacode);
        mmap.put("tInstitution", tInstitution);
        return prefix + "/edit";
    }

    /**
     * 修改保存机构
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TInstitution tInstitution) {
        return toAjax(tInstitutionService.updateTInstitution(tInstitution));
    }

    /**
     * 删除机构
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tInstitutionService.deleteTInstitutionByIds(ids));
    }
}

package com.soldier.controller.medical;

import java.util.List;

import com.soldier.controller.BaseController;
import com.soldier.domain.S201;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.IS201Service;
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
 * @Description:隶属关系Controller
 */
@Controller
@RequestMapping("/medical/s201")
public class S201Controller extends BaseController {
    private String prefix = "medical/s201";

    @Autowired
    private IS201Service s201Service;

    @GetMapping()
    public String s201() {
        return prefix + "/s201";
    }

    /**
     * 查询隶属关系列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(S201 s201) {
        startPage();
        List<S201> list = s201Service.selectS201List(s201);
        return getDataTable(list);
    }


    /**
     * 新增隶属关系
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存隶属关系
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(S201 s201) {
        return toAjax(s201Service.insertS201(s201));
    }

    /**
     * 修改隶属关系
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        S201 s201 = s201Service.selectS201ById(id);
        mmap.put("s201", s201);
        return prefix + "/edit";
    }

    /**
     * 修改保存隶属关系
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(S201 s201) {
        return toAjax(s201Service.updateS201(s201));
    }

    /**
     * 删除隶属关系
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(s201Service.deleteS201ByIds(ids));
    }
}

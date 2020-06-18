package com.soldier.controller.medical;

import com.soldier.controller.BaseController;
import com.soldier.controller.RedisUtil;
import com.soldier.domain.TFamily;
import com.soldier.domain.VO.AjaxResult;
import com.soldier.domain.page.TableDataInfo;
import com.soldier.service.ITFamilyService;
import com.soldier.utils.UidCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author soldier
 * @Date 20-6-18 上午9:58
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:专门针对县合官办领导的Controller
 */
@Controller
@RequestMapping("/medical/xhgb")
public class XhgbController extends BaseController {

    private String prefix = "medical/xhgb";

    /**
     * 本县参合家庭档案管理
     */
    @GetMapping("/family")
    public String family() {
        return prefix + "/family";
    }

    /**
     * 本县参合农民档案管理
     */
    @GetMapping("/person")
    public String person() {
        return prefix + "/person";
    }

    /**
     * 本县参合缴费登记记录
     */
    @GetMapping("/payment")
    public String payment() {
        return prefix + "/payment";
    }

    /**
     * 本县慢性病证管理
     */
    @GetMapping("/chronicinfo")
    public String chronicinfo() {
        return prefix + "/chronicinfo";
    }

    /**
     * 本县慢性病报销
     */
    @GetMapping("/reimburse")
    public String reimburse() {
        return prefix + "/reimburse";
    }

    /**
     * 本县参合登记
     */
    @GetMapping("/family/person")
    public String familyperson() {
        return prefix + "/familyPayment";
    }
}

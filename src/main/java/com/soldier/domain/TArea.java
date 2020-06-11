package com.soldier.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 行政区域信息对象 t_area
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-05
 */
public class TArea extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 区域编码
     */
    private String areacode;

    /**
     * 区域名称
     */
    private String areaname;

    /**
     * 级别
     */
    private String grade;

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("areacode", getAreacode())
                .append("areaname", getAreaname())
                .append("grade", getGrade())
                .toString();
    }
}

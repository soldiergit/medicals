package com.soldier.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 机构对象 t_institution
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-05
 */
public class TInstitution extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 所属行政区域
     */
    private String areacode;

    /**
     * 经办机构编号
     */
    private String agencode;

    /**
     * 机构名称
     */
    private String agenname;

    /**
     * 级别
     */
    private Long grade;

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAgencode(String agencode) {
        this.agencode = agencode;
    }

    public String getAgencode() {
        return agencode;
    }

    public void setAgenname(String agenname) {
        this.agenname = agenname;
    }

    public String getAgenname() {
        return agenname;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("areacode", getAreacode())
                .append("agencode", getAgencode())
                .append("agenname", getAgenname())
                .append("grade", getGrade())
                .toString();
    }
}

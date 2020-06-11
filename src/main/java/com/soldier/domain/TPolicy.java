package com.soldier.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 政策对象 t_policy
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-05
 */
public class TPolicy extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private String runyear;

    /**
     * 最大
     */
    private Double maxline;

    /**
     * 状态
     */
    private String status;

    private String remark;

    public void setRunyear(String runyear) {
        this.runyear = runyear;
    }

    public String getRunyear() {
        return runyear;
    }

    public void setMaxline(Double maxline) {
        this.maxline = maxline;
    }

    public Double getMaxline() {
        return maxline;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("runyear", getRunyear())
                .append("maxline", getMaxline())
                .append("status", getStatus())
                .append("remark", getRemark())
                .toString();
    }
}

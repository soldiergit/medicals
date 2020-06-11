package com.soldier.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 记录对象 t_recordfree
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 * @date 2020-06-05
 */
public class TRecordfree extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String perscode;

    /**
     * 免费
     */
    private Long freetotal;

    public void setPerscode(String perscode) {
        this.perscode = perscode;
    }

    public String getPerscode() {
        return perscode;
    }

    public void setFreetotal(Long freetotal) {
        this.freetotal = freetotal;
    }

    public Long getFreetotal() {
        return freetotal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("perscode", getPerscode())
                .append("freetotal", getFreetotal())
                .toString();
    }
}

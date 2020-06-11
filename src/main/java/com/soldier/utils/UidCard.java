package com.soldier.utils;

import java.util.Date;

/**
 * @Author soldier
 * @Date 20-6-11 上午10:30
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:生成uuid根据类型
 */
public class UidCard {

    public static String uidCard() {
        Date date = new Date();
        return String.valueOf(date.getTime());
    }

    public static void main(String[] args) {
        System.out.println(uidCard());
    }
}

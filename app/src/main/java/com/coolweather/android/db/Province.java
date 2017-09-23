package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lvxing on 2017/9/20.
 */

public class Province extends DataSupport {
    private int id;   //字段
    private String provinceName;  //省名
    private int provinveCode;  //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinveCode() {
        return provinveCode;
    }

    public void setProvinveCode(int provinveCode) {
        this.provinveCode = provinveCode;
    }
}

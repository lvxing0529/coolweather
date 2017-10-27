package com.coolweather.android.gson;

import android.content.pm.PackageManager;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lvxing on 2017/10/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

    @SerializedName("loc")
    public String updateTime;
    }
}

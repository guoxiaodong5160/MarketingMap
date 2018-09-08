package com.example.stringbootbo.bean;

import lombok.Data;

@Data
public class MarketingIcon {
    private String  key;            //地图应用申请的key
    private String poiNo;           //poi唯一标识id
    private String poiName;         //poi名字
    private String buildId;         //场馆id
    private String floor;            //poi所在位置，楼层
    private String x;               //poi所在位置，x
    private String y;                //poi所在位置，y
    private Integer marketingType;    //营销活动类型

}

package com.example.stringbootbo.bean;

import lombok.Data;

@Data
public class BasePoi {
    private String key;
    private String poiNo;           //poi唯一标识id
    private String poiName;         //poi名字
    private String buildId;         //场馆id
    private String floor;            //poi所在位置，楼层
    private String x;               //poi所在位置，x
    private String y;                //poi所在位置，y


    private Integer dist;       //直线距离，单位米；跨楼层距离+20

}

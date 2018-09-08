package com.example.stringbootbo.bean;

import lombok.Data;

import java.util.Date;

@Data
public class StoreDetails {
    private String  key;            //地图应用申请的key
    private String poiNo;           //poi唯一标识id
    private String poiName;         //poi名字
    private String keywords;       //搜索关键字
    private String buildId;         //场馆id
    private String floor;            //poi所在位置，楼层
    private String x;               //poi所在位置，x
    private String y;                //poi所在位置，y
    private Integer dist;       //直线距离，单位米；跨楼层距离+20
    private Boolean IsMarketing;    //营销活动类型
    private Date openTime;          //营业时间
    private String typeName;       //店铺类型
    private String typeNo;         //店铺类型id
//    private Integer   RowNumber;     //排号
//    private String waitingTime;   //等待时间
//    private String Icon;           //店铺Icon
//    private String tel;            //电话
//  private String marktetingNum;         //优惠卷数量
    private Mwee mwee;
    private Marketing marketing;





}

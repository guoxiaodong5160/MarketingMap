package com.example.stringbootbo.bean;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class Poi {
    private String  key;            //地图应用申请的key
    private Integer pageNo;         //当前页
    private Integer pageSize;       //每页条数
    private String poiNo;           //poi唯一标识id
    private String poiName;         //poi名字
    private String keywords;       //搜索关键字
    private String buildId;         //场馆id
    private String floor;            //poi所在位置，楼层
    private String x;               //poi所在位置，x
    private String y;                //poi所在位置，y
    private Integer dist;       //直线距离，单位米；跨楼层距离+20
    private Integer marketingType;    //营销活动类型

}

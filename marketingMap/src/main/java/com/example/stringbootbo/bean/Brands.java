package com.example.stringbootbo.bean;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author guoxiaoodng
 */
@Data
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class Brands  {
    /**
     * 地图应用申请的key
     */
    private String key;
    /**
     * 场馆id
     */
    private String buildid;
    /**
     * 用户当前坐标，楼层
     */
    private String floor;
    /**
     * 用户当前坐标，x
     */
    private String x;
    /**
     * 用户当前坐标，y
     */
    private String y;
    /**
     * 品牌名称
     */
    private String poiName;
    /**
     * poi唯一标识id
     */
    private String poiNo;
    /**
     * 是否有营销活动，需要根据营销活动结束时间判断
     * 0  代表有营销活动
     * 1 无营销活动
     */
    private Integer marketingType;
    /**
     * 近一周搜索次数
     */
    private Integer searchCount;
    /**
     * 品牌iocn
     */
    private String Icon;
    /**
     * 店铺数量
     */
    private Integer num;


}

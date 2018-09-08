package com.example.stringbootbo.bean;

import lombok.Data;

import java.util.List;

/**
 * @author guoxiaodong
 */
@Data
public class ServiceFacilities {
    private String name;
    /**
     * 服务设施icon
     */
    private String icon;

    private List<BasePoi> PoiList;

}

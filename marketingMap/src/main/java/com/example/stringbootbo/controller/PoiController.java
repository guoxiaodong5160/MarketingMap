package com.example.stringbootbo.controller;

import com.example.stringbootbo.bean.Poi;
import com.example.stringbootbo.utils.Pagebean;
import com.example.stringbootbo.utils.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("poi")
@CrossOrigin(origins = "*",maxAge = 3600)
public class PoiController {
    /**
     * 模糊搜索
     * @return
     */
    @RequestMapping("/searchkeys")
    public Result searchkeys(Poi poi){
        List<Poi> list = new ArrayList<>();
        int a=0;
        if(poi.getPageNo() != null) {


            if (poi.getPageNo() == 1) {
                a = 0;
            } else {
                a = 10;
            }
        }
        for (int i = a; i < 10+a; i++) {
            Poi pois = new Poi();
            pois.setBuildId("862500010030300016");
            pois.setFloor("F1");
            pois.setPoiName("迪卡侬" );
            pois.setKey("K7I23869HD");
            pois.setPoiNo("628");
            pois.setX("346");
            pois.setY("-159");
            pois.setKeywords("迪卡侬");
            pois.setDist(20);
            pois.setMarketingType(0);
            list.add(pois);
        }
        Pagebean<Poi> pagebean = new Pagebean<>();
        pagebean.setPageNo(poi.getPageNo());
        pagebean.setPageSize(poi.getPageSize());
        pagebean.setDateList(list);
        pagebean.setPageCount(2);
        return Result.success(pagebean);
    }

}

package com.example.stringbootbo.controller;

import com.example.stringbootbo.bean.Brands;
import com.example.stringbootbo.utils.CodeMsg;
import com.example.stringbootbo.utils.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/brands")
@CrossOrigin(origins = "*",maxAge = 3600)
public class BrandsController {


    /**
     * 服务设施接口
     * @return
     */
    @RequestMapping("/getBrandsList")
    public Result getBrandsList(Brands Brands){
        List<Brands> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Brands brands = new Brands();
            brands.setBuildid("862500010030300016");
            brands.setFloor("F1");
            brands.setIcon("http://maps.rtmap.com/map3d/statics/img/df-subway.png");
            brands.setPoiName("迪卡侬");
            brands.setKey("K7I23869HD");
            brands.setPoiNo("628");
            brands.setX("346");
            brands.setY("-159");
            brands.setIcon("http://maps.rtmap.com/map3d/statics/img/df-subway.png");
            brands.setMarketingType(0);
            brands.setSearchCount(i);
            if (i > 4) {
                brands.setMarketingType(1);
            }
            brands.setSearchCount(1 + i);
            result.add(brands);
        }
        Result.error(CodeMsg.NOT_FIND_DATA);
        return Result.success(result);
    }

}

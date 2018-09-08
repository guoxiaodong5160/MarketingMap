package com.example.stringbootbo.controller;

import com.example.stringbootbo.bean.MarketingIcon;
import com.example.stringbootbo.utils.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("marketingIcon")
@CrossOrigin(origins = "*",maxAge = 3600)
public class MarketingIconController {
    /**
     * 服务设施接口
     * @return
     */
    @RequestMapping("/getMarketingIcon")
    public Result getMarketingIcon(MarketingIcon marketingIcon){
        MarketingIcon MarketingIco = new MarketingIcon();
        MarketingIco.setBuildId("862500010030300016");
        MarketingIco.setFloor("F1");
//        storeDetail.setIcon("2323");
        MarketingIco.setPoiName("迪卡侬");
        MarketingIco.setKey("K7I23869HD");
        MarketingIco.setPoiNo("628");
        MarketingIco.setX("346");
        MarketingIco.setY("-159");
        MarketingIco.setMarketingType(0);
        return Result.success(MarketingIco);
    }

}

package com.example.stringbootbo.controller;

import com.example.stringbootbo.bean.Marketing;
import com.example.stringbootbo.bean.Mwee;
import com.example.stringbootbo.bean.StoreDetails;
import com.example.stringbootbo.utils.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/storeDetails")
@CrossOrigin(origins = "*",maxAge = 3600)
public class StoreController {
    /**
     * 服务设施接口
     * @return
     */
    @RequestMapping("/getstoreDetails")
    public Result getstoreDetails(StoreDetails storeDetails){
        StoreDetails storeDetail = new StoreDetails();
        storeDetail.setBuildId("862500010030300016");
        storeDetail.setFloor("F1");
//        storeDetail.setIcon("2323");
        storeDetail.setPoiName("迪卡侬");
        storeDetail.setKey("K7I23869HD");
        storeDetail.setPoiNo("628");
        storeDetail.setX("346");
        storeDetail.setY("-159");
//        storeDetail.setIsMarketing(true);
        storeDetail.setOpenTime(new Date());
        storeDetail.setKeywords("迪卡侬");
//        storeDetail.setMarktetingNum("2");
//        storeDetail.setTel("13456759876");
//        storeDetail.setRowNumber(12);
        storeDetail.setTypeName("服饰");
//        storeDetail.setWaitingTime("2小时");
        storeDetail.setTypeNo("12");
        Mwee mwee = new Mwee();
        mwee.setDiscount("");
        mwee.setAvg("271");
        mwee.setAddress("玄武区中山路18号德基广场6楼");
        mwee.setLimit(30000);
        mwee.setLogo("http://img3.mwfile.cn/oa/upload/201704/2218/58fb2b679b81b.jpg");
        mwee.setName("黄粱一孟四川火锅");
        mwee.setNotice("不用排队");
        mwee.setOff(0);
        mwee.setOpenTime("10:00--22:00");
        mwee.setTelNumber("025-86777656");
        mwee.setStyle("火锅");
        mwee.setQNotice("听到叫号请到迎宾台，过号作废");
        mwee.setSId(167329);
        mwee.setState(5);
        mwee.setTLogo( "http://img3.mwfile.cn/oa/upload/201704/2218/58fb2b69ed0b7.jpg");
        mwee.setDiscount("");
        mwee.setStars(5);
        mwee.setShoppingDistrict( "江苏/南京/玄武区/新街口地区/南京德基广场/");
        mwee.setStoreId("L605");
        mwee.setQueues(null);
        Marketing marketing = new Marketing();
        marketing.setMarktetId("11");
        marketing.setMarktetNum(2);
        storeDetail.setMwee(mwee);
        storeDetail.setMarketing(marketing);
        return Result.success(storeDetail);
    }


}

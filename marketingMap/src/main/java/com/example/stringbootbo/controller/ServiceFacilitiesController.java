package com.example.stringbootbo.controller;


import com.example.stringbootbo.bean.BasePoi;
import com.example.stringbootbo.bean.ServiceFacilities;
import com.example.stringbootbo.utils.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serviceFacilities")
@CrossOrigin(origins = "*",maxAge = 3600)
public class ServiceFacilitiesController {
    /**
     * 服务设施接口
     * @return
     */
    @RequestMapping("/getServiceFacilitieList")
    public Result getServiceFacilitieList(BasePoi basePoi){
        List<ServiceFacilities> result1 = new ArrayList<>();
        for (int j=0;j<5;j++){
            List<BasePoi> result = new ArrayList<>();
            ServiceFacilities serviceFacilities = new ServiceFacilities();
            serviceFacilities.setIcon("http://maps.rtmap.com/map3d/statics/img/df-subway.png");
            serviceFacilities.setName("卫生间");
            for(int i=0;i<5;i++){
                BasePoi basePoi1 = new BasePoi();
                basePoi1.setBuildId("862500010030300016");
                basePoi1.setDist(20);
                basePoi1.setFloor("F1");
                if(i==0){
                    basePoi1.setPoiName("卫生间");
                    basePoi1.setPoiNo("628");
                }else if(i==1){
                    basePoi1.setPoiName("自动扶梯");
                    basePoi1.setPoiNo("918");
                }else if(i==2){
                    basePoi1.setPoiName("vip室");
                    basePoi1.setPoiNo("918");
                }else if(i==3){
                    basePoi1.setPoiName("茶水间");
                    basePoi1.setPoiNo("918");
                }else if(i==4){
                    basePoi1.setPoiName("直梯");
                    basePoi1.setPoiNo("918");
                }

                basePoi1.setX("168 ");
                basePoi1.setY("-194");
                result.add(basePoi1);
                serviceFacilities.setPoiList(result);
            }
            result1.add(serviceFacilities);
        }

        return Result.success(result1);
    }


}

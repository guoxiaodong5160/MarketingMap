package com.example.stringbootbo.controller;


import com.example.stringbootbo.bean.User;
import com.example.stringbootbo.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/hello")
    public String  hello(@RequestBody String result) {
                JSONObject jsonArray = JSONObject.fromObject(result);


                 // 根据key值取值
               String username = jsonArray.getString("buildid");
        Integer id=1;
        User user = userService.selectById(id);
        System.out.print(user);
        return "user";
    }

}

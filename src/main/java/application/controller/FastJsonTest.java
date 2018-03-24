package application.controller;

import application.entity.Test;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fastJson")
public class FastJsonTest {

    @RequestMapping("/get")
    public String getFastJSON(){
        Test t = new Test();
        t.setId(2);
        t.setName("xzb");
        return JSONObject.toJSONString(t);
    }
}

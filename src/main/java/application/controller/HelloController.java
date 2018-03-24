package application.controller;

import application.dao.TestDao;
import application.entity.Test;
import application.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class HelloController {
    @Resource
    private TestService testService;

    @RequestMapping("/")
    public String Hello(){
        return"Hello world!";
    }

    @RequestMapping("/getTest")
    public Test getTest(){
        Test t = new Test();
        t.setId(1);
        t.setName("肖正宝");
        return t;
    }

    @RequestMapping("/exception")
    public String exception(){
        int i = 1 / 0;
        return "test";
    }

    @RequestMapping("/getBolg")
    public String getBolg(){
        return testService.getBlog();
    }

    @RequestMapping("/file")
    public String file(){
        return "/test";
    }


}

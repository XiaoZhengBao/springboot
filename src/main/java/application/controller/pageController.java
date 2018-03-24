package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file")
public class pageController {

    @RequestMapping("/")
    public String returnFile(){
        return "/test";
    }


}


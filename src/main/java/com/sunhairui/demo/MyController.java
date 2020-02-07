package com.sunhairui.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    @RequestMapping("/fuck")
    @ResponseBody
    public String fuck(){
        return " fuck the world";
    }

 @RequestMapping("/fuckyou")
    @ResponseBody
    public String fuckyou(){
        return " fuck the you";
    }

}

package com.sunhairui.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    @RequestMapping("/fuck")
    public String fuck(){
        return " fuck the world";
    }

}

package com.sunhairui.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;


@Controller
public class MyController {

    @Value("${app.upload.directory}")
    private String path;


    @RequestMapping("/")
    public String out(){
        System.out.println("hot deploy");
        System.out.println("what the fuck ? ");

        return "index";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam(value = "photo",required = true) MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(new File(path+fileName)));
        return path+fileName;
    }

    @RequestMapping("/fuck")
    public String fuck(){
        throw new RuntimeException("fuck");
    }


}

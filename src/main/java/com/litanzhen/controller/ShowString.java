package com.litanzhen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

@Controller
public class ShowString {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping("/getDate")
    public String getDate(){
        Date date = new Date();
        String str = date.toString();
        return str;
    }
}

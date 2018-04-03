package com.sufuring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/index.html")
    public String toIndex(){
        return "shop/index";
    }

    /**
     * 访问根目录转发到首页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "forward:/index.html";
    }
}

package com.sufuring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/shop/product/cartList.html")
    public String CartList(){
        return "shop/product/cartList";
    }

    @RequestMapping("/shop/product/productList.html")
    public String ProductList(){
        return "shop/product/productList";
    }

    @RequestMapping("/shop/product/productDetail.html")
    public String ProductDetail(){
        return "shop/product/productDetail";
    }


}

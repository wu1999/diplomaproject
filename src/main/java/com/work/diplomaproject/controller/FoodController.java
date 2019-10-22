package com.work.diplomaproject.controller;

import com.work.diplomaproject.entity.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FoodController {
    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        request.setAttribute("name","wujunfeng");
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "XXXXXXXX";
    }
    @RequestMapping("/seek_product")
    @ResponseBody
    public Food seek_product(@RequestParam(value = "name")String name){
           if (name!=null) {
               Food food = new Food();
               food.setId(1);
               food.setName("茄子");
               return food;
           }
           return null;

    }
}


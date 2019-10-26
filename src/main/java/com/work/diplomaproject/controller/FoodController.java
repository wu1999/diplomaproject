package com.work.diplomaproject.controller;

import com.work.diplomaproject.entity.Food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
    public String seek_product(@RequestParam(value = "name")String name,HttpServletRequest request) {
        List<Food>foodList=new ArrayList<>();
        if (name!=null) {
            for (int i = 0; i <5 ; i++) {
                Food food = new Food();
                food.setId(1);
                food.setName("茄子");
                foodList.add(food);
            }
               request.setAttribute("food",foodList);
               return "forward:index";
           }
           return null;

    }
}


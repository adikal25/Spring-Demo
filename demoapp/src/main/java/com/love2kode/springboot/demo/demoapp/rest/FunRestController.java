package com.love2kode.springboot.demo.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/drinkh2o")
    public String getDailyWater(){
        return "Drink Water duhhh!!";
    }
    @GetMapping("/eatfood")
    public String getDailyFood(){
        return "Eat food duhhh!!";
    }

}

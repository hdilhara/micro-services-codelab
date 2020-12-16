package com.hdilhara.service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @RequestMapping("/")
    public String rootMapping(){
        return  "Servce2";
    }

}

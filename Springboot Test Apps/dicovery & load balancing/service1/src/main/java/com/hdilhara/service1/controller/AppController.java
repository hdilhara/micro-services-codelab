package com.hdilhara.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @RequestMapping("/home")
    public String rootMapping(){
        return  "Servce1";
    }

}

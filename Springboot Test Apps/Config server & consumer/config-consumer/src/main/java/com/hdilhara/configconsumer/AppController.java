package com.hdilhara.configconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${service.name}")
    String serviceName;


    @RequestMapping("/")
    public String rootMapping(){

        return serviceName;
    }

}

package com.hdilhara.resourceserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/")
    @PreAuthorize("hasAuthority('read_profile')")
    public String rootMap(){
        return "Resource Server!";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ROLE_admin')")
    public String adminMap(){
        return "Admin Resource";
    }
    @RequestMapping("/operator")
    @PreAuthorize("hasRole('ROLE_operator')")
    public String oeratorMap(){
        return "Operator Resource";
    }
    @RequestMapping("/both/roles")
    @PreAuthorize("hasRole('ROLE_admin') or hasRole('ROLE_operator')")
    public String bothRolesMap(){
        return "Both Roles Resource";
    }

}

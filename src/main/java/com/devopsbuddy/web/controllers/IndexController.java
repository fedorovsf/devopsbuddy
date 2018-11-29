package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergei on 29/11/2018.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}

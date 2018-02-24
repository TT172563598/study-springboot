package com.study.studyspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：21:20
 * ===================
 */
@Controller
@RequestMapping(value = "/user")
public class IndexController {


    @RequestMapping(value = "/login_view", method = RequestMethod.GET)
    public String login_view(){
        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}

package com.chil.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // return View
public class IndexController {

    //localhost:8080/
    //localhost:8080

    @GetMapping({"","/"})
    public String index(){
        System.out.println("inside index");
        return "index";
    }
}

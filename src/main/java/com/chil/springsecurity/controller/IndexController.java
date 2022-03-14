package com.chil.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // return View
public class IndexController {

    //localhost:8080/
    //localhost:8080

    @GetMapping({"","/"})
    public String index(){
        System.out.println("inside index");
        return "index";
    }

    @GetMapping("/user")
    public @ResponseBody String user(){
        return "user";
    }
    @GetMapping("/admin")
    public @ResponseBody String admin(){
        return "admin";
    }
    @GetMapping("/manager")
    public @ResponseBody String manager(){
        return "manager";
    }
    @GetMapping("/login") // Sprongboot is handling buil-in login. it could be conflict.
    public @ResponseBody String login(){
        return "login";
    }
    @GetMapping("/join")
    public @ResponseBody String join(){
        return "join";
    }
    @GetMapping("/joinProc")
    public @ResponseBody String joinProc(){
        return "Successfully Registered";
    }
}

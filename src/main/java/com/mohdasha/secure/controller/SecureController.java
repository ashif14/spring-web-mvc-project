package com.mohdasha.secure.controller;

import com.mohdasha.root.pojo.HelloWorld;
import com.mohdasha.root.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello-world")
public class SecureController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/message")
    public @ResponseBody HelloWorld getHelloWorldMessage() {
        return helloWorldService.getHelloWorld("Secure");
    }
    @GetMapping(value = "/welcome")
    public @ResponseBody HelloWorld getWelcomeData() {
        return helloWorldService.getHelloWorld("Welcome Secure");
    }
}

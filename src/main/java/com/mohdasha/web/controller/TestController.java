package com.mohdasha.web.controller;

import com.mohdasha.root.pojo.HelloWorld;
import com.mohdasha.root.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello-world")
public class TestController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/message")
    public @ResponseBody HelloWorld getTestData() {
        return helloWorldService.getHelloWorld(" Normal");
    }
}

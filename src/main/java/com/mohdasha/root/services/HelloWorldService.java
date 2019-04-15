package com.mohdasha.root.services;

import com.mohdasha.root.dao.HelloWorldDao;
import com.mohdasha.root.pojo.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    @Autowired
    private HelloWorldDao helloWorldDao;

    public HelloWorld getHelloWorld(String message) {
        return helloWorldDao.getHelloWorld(message);
    }
}

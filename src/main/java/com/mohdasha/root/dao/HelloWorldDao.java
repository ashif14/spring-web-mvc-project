package com.mohdasha.root.dao;

import com.mohdasha.root.pojo.HelloWorld;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldDao {
    public HelloWorld getHelloWorld(String message) {
        HelloWorld helloWorld = new HelloWorld();

        helloWorld.setMessage("Hello World"+ message);

        return helloWorld;
    }
}

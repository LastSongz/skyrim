package com.skyrim.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/111")
    public String helloWorld(){
        return "伊莉雅世界第一可爱";
    }
}

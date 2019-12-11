package com.skyrim.springboothelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpToHtml {
    @RequestMapping("/index")
    public String jumpToIndex(){
        return "index.html";
    }
}

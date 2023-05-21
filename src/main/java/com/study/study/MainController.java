package com.study.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/study/hello/")
    public @ResponseBody String hello(){
        return "Hello World!";
    }
}

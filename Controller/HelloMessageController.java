package com.example.hellomessagingapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {
    @RequestMapping("/welcome")
    public String sayHello() {
        return "welcome  to Hello Messaging App";
    }
}

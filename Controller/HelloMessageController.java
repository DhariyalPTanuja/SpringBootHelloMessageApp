package com.example.hellomessagingapp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloMessageController {

    @PostMapping("/post")
    public String sayHelloMsg(@RequestBody String firstName, String lastName){
        return "Hello " + firstName + " " + lastName + " Welcome to Bridgelabz!!";
    }

}

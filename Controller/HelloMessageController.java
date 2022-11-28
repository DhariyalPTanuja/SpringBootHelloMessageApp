package com.example.hellomessagingapp.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {

    @RequestMapping("/param/{name}")
   //http://localhost:8080/param/mark
    public String sayHelloMsg(@PathVariable String name) {
        return "Hello " + name + " Welcome to Bridgelabz!! ";
    }

}

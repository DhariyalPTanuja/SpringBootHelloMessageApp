package com.example.hellomessagingapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {

    @RequestMapping("/query")
    //http://localhost:8080/query?name=Mark
    public String sayHelloMsg(@RequestParam(value = "name") String name) {
        return "Hello " + name + "! ";
    }

}

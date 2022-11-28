package com.example.hellomessagingapp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloMessageController {
    @RequestMapping("/welcome")
    public String sayHello() {
        return "welcome  to Hello Messaging App";
    }

    @RequestMapping("/msg")
    public String sayHelloMsg() {
        return "Hello From BridgeLabz !!!! ";
    }

    @RequestMapping("/query")
    //http://localhost:8080/query?name=Mark
    public String sayHelloQueryMsg(@RequestParam(value = "name") String name) {
        return "Hello " + name + "! ";
    }
    @RequestMapping("/param/{name}")
    //http://localhost:8080/param/mark
    public String sayHelloPathVariableMsg(@PathVariable String name) {
        return "Hello " + name + " Welcome to Bridgelabz!! ";
    }
    @PostMapping("/post")
    public String sayHelloPostMsg(@RequestBody String firstName, String lastName){
        return "Hello " + firstName + " " + lastName + " Welcome to Bridgelabz!!";
    }
    @PutMapping("/put/{firstName}")
    public String sayHelloMsg(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " Welcome to Bridgelabz!!";
    }

}

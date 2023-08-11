package com.cantaust.springbootdemo.controller;

import com.cantaust.springbootdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/") //GET HTTP request by default
    public String helloWorld(){
        return "Hello, World!";
    }


    //@RequestMapping("/user")
    @GetMapping("/user")
    public User user () {
        User user = new User();
        user.setId("1");
        user.setName("John");
        user.setEmailId("john@email.com");

        return user;
    }

    @GetMapping("/{id}/{id2}") //{id} -> URI template variable
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name){
        return "The path variable is: " + id + "and name: " + name;
    }

    @GetMapping("/requestParam")
    public String requestParam(@RequestParam String name, @RequestParam(name="email", required = false, defaultValue = "") String emailId){
        return "The request param is: " + name + " email is: " + emailId;
    }

}

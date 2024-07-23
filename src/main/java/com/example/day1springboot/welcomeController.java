package com.example.day1springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String name(){
        return "My name is Shahad";

    }
    @GetMapping("/age")
    public String age(){
        return "My age is 22" ;
    }
    @GetMapping("/check/status")
    public String cheack(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String server(){
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public String[] arryName(){
        String[]names={"Ali","shahad","Mohamad"};
        return names;
    }


}

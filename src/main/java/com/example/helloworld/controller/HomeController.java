package com.example.helloworld.controller;

/*
 * Lancement du Spring
 * mvn spring-boot:run
 * 
 */
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GetMapping("/test")
    public Map<String,String> test() {
        return Map.of("Test", "test");
    }

    @GetMapping("/security")
    public Map<String,String> security() {
        return Map.of("Security", "security");
    }
}

package com.example.helloworld.controller;

/*
 * Lancement du Spring
 * mvn spring-boot:run
 * 
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
//@RequestMapping("/page")
public class PageController {

    @RequestMapping(value = "/page")
    public String page() {
        return "page";
   }

}

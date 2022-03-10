package com.boruto.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("home")
    public String home(@RequestParam String nama){
        return "Halo kamu " + nama;
    }
}
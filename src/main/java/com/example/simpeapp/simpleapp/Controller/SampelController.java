package com.example.simpeapp.simpleapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class SampelController {
    
    @GetMapping(path = "/test")
    public String test() {
        return "Hello World";

    }
}

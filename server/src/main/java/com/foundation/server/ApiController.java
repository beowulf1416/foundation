package com.foundation.server;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {

    @GetMapping("/status")
    public String status() {
        return "test";
    }
    
}

package com.multi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MyService;

@RestController
public class ApiController {

    @GetMapping("/msg")
    public String getMessage(){
       return MyService.getMessage();
    }
}

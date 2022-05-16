package com.test.test1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/")
    String test(){
        return ("test");
    }
}

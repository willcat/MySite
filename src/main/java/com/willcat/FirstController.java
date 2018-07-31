package com.willcat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	 //@requestMapping
    @RequestMapping("/Hello")
    public String hello() {
        
        return "Hello";
    }
}

package com.yom.microservicedemo.gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class SentanceController {

        @GetMapping("/")
        public String sentence() {
            return "sentence";
        }
    }



package com.lokesh.cloud.employee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(value = "/greet")
public class GreetController {
    public String greetingMessage() {
        log.info("✅✅✅✅");
        return "welcome to microservices";
    }
}

package com.mzee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/wel")
    public String sodhowow() {
        return "Ku soo dhawow dunida SpringBootApplication!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Salamaad saxib kuso dhowow markle , " + name + "!";
    }
}
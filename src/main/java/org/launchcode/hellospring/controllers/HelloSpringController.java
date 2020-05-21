package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {
    @GetMapping("helloMiley")
    @ResponseBody
    public String helloMiley() {
        return "Hello, Miley!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, yesterday!";
    }

    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParameter(@RequestParam String name) {
        return "Hello, " + name + " !";
    }
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParameter(@PathVariable String name) {
        return "Hello, " + name + " !";
    }
}

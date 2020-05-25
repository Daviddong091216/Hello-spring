package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {
    //helloMiley
    @GetMapping("helloMiley")
    @ResponseBody
    public String helloMiley() {
        return "Hello, Miley!";
    }

    //goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, yesterday!";
    }

    //hello1?name=name
    @ResponseBody
    @RequestMapping(value = "hello1", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParameter(@RequestParam String name) {
        return "Hello, " + name + " !";
    }

    //hello2/name
    @GetMapping("hello2/{name}")
    @ResponseBody
    public String helloWithPathParameter(@PathVariable String name) {
        return "Hello, " + name + " !";
    }

    //form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

}

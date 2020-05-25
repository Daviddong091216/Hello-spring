package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(value = "hello1", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParameter(@RequestParam String name, Model model) {
        String theGreeting = "hello " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    //hello2/name
    @GetMapping("hello2/{name}")
    public String helloWithPathParameter(@PathVariable String name, Model model) {
        String theGreeting = "hello " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    //form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-list")
    public String helloNameList(Model model) {
        List<String> nameList = new ArrayList<>();
        nameList.add("NiCole");
        nameList.add("Ethan");
        nameList.add("Liano");
        nameList.add("Damian");
        nameList.add("Miley");
        nameList.add("Aaron");
        model.addAttribute("names",nameList);
        return "hello-list";
    }

}

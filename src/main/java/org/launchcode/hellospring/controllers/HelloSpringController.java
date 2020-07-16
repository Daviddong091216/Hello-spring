package org.launchcode.hellospring.controllers;

import org.launchcode.hellospring.data.CoffeeOption;
import org.launchcode.hellospring.data.Flavor;
import org.launchcode.hellospring.data.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloSpringController {
    static ArrayList<Flavor> coffeeOptions = new ArrayList<>();
    static ArrayList<Shop> shops = new ArrayList<>();



    @GetMapping("display")
    public String displayAllOptional(Model model){
        Flavor flavor1=new Flavor("Java1");
        Flavor flavor2=new Flavor("Java2");
        Flavor flavor3=new Flavor("Java3");
        coffeeOptions.add(flavor1);
        coffeeOptions.add(flavor2);
        coffeeOptions.add(flavor3);
        Shop shop1=new Shop("costco1",coffeeOptions);
        Shop shop2=new Shop("costco2",coffeeOptions);
        Shop shop3=new Shop("costco3",coffeeOptions);
        shops.add(shop1);
        shops.add(shop2);
        shops.add(shop3);
        model.addAttribute("shops",shops);
        model.addAttribute("coffeeOptions",coffeeOptions);
        return "list";
    }

    //helloMiley1
    @GetMapping("helloMiley1")
    @ResponseBody
    public String helloMiley1() {
        return "Hello, Miley!";
    }

    //It does not work
    @PostMapping("helloMiley2")
    @ResponseBody
    public String helloMiley2() {
        return "Hello, Miley!";
    }

    //helloMiley3
    @GetMapping("helloMiley3")
    @ResponseBody
    public String helloMiley3() {
        return "Hello, Miley!";
    }

    //It does not work
    @PostMapping("helloMiley3")
    @ResponseBody
    public String helloMiley4() {
        return "Hello, Miley!";
    }

    //helloParam1?name=Miley
    @GetMapping("helloParam1")
    @ResponseBody
    public String helloParam(@RequestParam String name) {
        return "hello " + name + "!";
    }

    //helloParam2/Miley
    @GetMapping("helloParam2/{name}")
    @ResponseBody
    public String helloParam2(@PathVariable String name) {
        return "hello " + name + "!";
    }

    //form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    //    hello1?name=name
//    @RequestMapping(value = "hello1", method = {RequestMethod.GET, RequestMethod.POST})
//    @GetMapping("hello1")
//    public String helloWithQueryParameter(@RequestParam String name, Model model) {
//        String theGreeting = "hello " + name + "!";
//        model.addAttribute("greeting", theGreeting);
//        return "hello";
//    }
    @PostMapping("hello1")
    public String helloWithQueryParameter1(@RequestParam String name, Model model) {
        String theGreeting = "hello " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

//    @RequestMapping(value = "hello1", method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParameter2(@RequestParam String name, Model model) {
//        String theGreeting = "hello " + name + "!";
//        model.addAttribute("greeting", theGreeting);
//        return "hello";
//    }


    @GetMapping("form2")
    public String helloForm2() {
        return "form2";
    }

    //hello2/name
//we can not pass @PathVariable from form to html.
//    @RequestMapping(value = "/hello2/{coder}", method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("hello2/{coder}")
    public String helloWithPathParameter(@PathVariable("coder") String coder,
                                         Model model) {
        String theGreeting = "hello " + coder + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }


    //hello2/name
//    @PostMapping("/hello2")
//    public String helloWithPathParameter2(@ModelAttribute String coder,
//                                          Model model) {
//        String theGreeting = "hello " + coder + "!";
//        model.addAttribute("greeting", theGreeting);
//        return "hello";
//    }


    @GetMapping("hello-list")
    public String helloNameList(Model model) {
        List<String> nameList = new ArrayList<>();
        nameList.add("NiCole");
        nameList.add("Ethan");
        nameList.add("Liano");
        nameList.add("Damian");
        nameList.add("Miley");
        nameList.add("Aaron");
        model.addAttribute("names", nameList);
        return "hello-list";
    }

}

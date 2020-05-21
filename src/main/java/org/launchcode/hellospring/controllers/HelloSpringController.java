package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value = "hello")
public class HelloSpringController {
    //hello/Miley
    @GetMapping("Miley")
    public String helloMiley() {
        return "Hello, Miley!";
    }

    //hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, yesterday!";
    }

    //hello?name=name
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParameter(@RequestParam String name) {
        return "Hello, " + name + " !";
    }

    //hello/name
    @GetMapping("{name}")
    public String helloWithPathParameter(@PathVariable String name) {
        return "Hello, " + name + " !";
    }

    //hello/form
    @GetMapping("form")
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'name' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}

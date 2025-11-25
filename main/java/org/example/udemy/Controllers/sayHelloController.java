package org.example.udemy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {

    @RequestMapping("say-Hello")
    @ResponseBody
    public String sayHello(){
        return "HEY FROm My SIDE!";
    }

    @RequestMapping("say-Hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        return "Hey HTML this side";
    }

    @RequestMapping("sayHello-jsp")
    public String sayHelloJsp(){
        return "sayhello";
    }
}

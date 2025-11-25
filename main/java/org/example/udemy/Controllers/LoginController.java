package org.example.udemy.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

//http://localhost:8080/login?name=ayush
@Controller
public class LoginController {


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcomepage(@RequestParam String name, @RequestParam String password, ModelMap model){
        model.put("name",name);
        model.put("password",password);

        return "Welcome";
    }
}

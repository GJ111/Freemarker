package com.spring.freemarker.controller;

import com.spring.freemarker.entity.User;
import com.spring.freemarker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
//ju';''
    @RequestMapping("guojian")
    public String name(Model model) {
        model.addAttribute("name", "几把" + "");
        return "User";
    }
}

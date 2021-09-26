package com.bondarenko.agency.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultController {
    @RequestMapping(value = {"", "index", "home", "home_page"})

    public String getHomePage(Model model) {
        model.addAttribute("username",
                SecurityContextHolder.getContext().getAuthentication().getName());

        return "default/index";
    }
}

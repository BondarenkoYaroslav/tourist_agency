package com.bondarenko.agency.controller;

import com.bondarenko.agency.entity.Users;
import com.bondarenko.agency.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;

    @GetMapping()
    public String getUsers(Model model) {
        List<Users> usersList = usersService.getAllUsers();
        model.addAttribute("usersList", usersList);

        return "user/user_list";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new Users());

        return "user/user_form";
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam("username") String name, Model model) {
        Users user = usersService.getUser(name);
        model.addAttribute("user", user);

        return "user/user_form";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("username") String name) {
        usersService.deleteUser(name);

        return "redirect:/user";
    }

    @PostMapping("/save")
    public String saveOrUpdateUser(@ModelAttribute("user") Users user) {
        usersService.saveOrUpdateUser(user);

        return "redirect:/user";
    }
}

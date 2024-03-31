package com.vedha.docker.controller;

import com.vedha.docker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/", "/app"})
@AllArgsConstructor
public class PageController {

    private UserService userService;

    @GetMapping(value = {"/"})
    public String reDirect(Model model) {

        return "redirect:app/home";
    }

    @GetMapping(value = {"/home"})
    public String returnHomePage(Model model) {

        model.addAttribute("users", userService.getUsers());

        return "index";
    }
}

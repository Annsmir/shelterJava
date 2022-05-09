package com.example.shelter.controllers;

import com.example.shelter.services.HeaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final HeaderService headerService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("addNews", headerService.isUser());
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        model.addAttribute("addNews", headerService.isUser());
        return "about";
    }

    @GetMapping("/auth/login")
    public String getLoginPage(Model model) {
        model.addAttribute("title", "Логин");
        model.addAttribute("addNews", headerService.isUser());
        return "login";
    }

    @GetMapping("/auth/signin")
    public String getSigninPage(Model model) {
        model.addAttribute("title", "Регистрация");
        model.addAttribute("addNews", headerService.isUser());
        return "signin";
    }

}
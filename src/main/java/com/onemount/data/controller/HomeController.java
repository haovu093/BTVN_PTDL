package com.onemount.data.controller;

import com.onemount.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired private PersonRepository personRepo;

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about";
    }


}
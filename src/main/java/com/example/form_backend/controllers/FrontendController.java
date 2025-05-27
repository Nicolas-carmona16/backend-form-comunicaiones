package com.example.form_backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/")
    public String showForm() {
        return "form"; // Nombre del archivo HTML (sin extensión)
    }
}
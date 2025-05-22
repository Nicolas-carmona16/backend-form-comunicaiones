package com.example.form_backend.controllers;

import com.example.form_backend.models.FormData;
import com.example.form_backend.repositories.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/form")
@CrossOrigin(origins = "http://localhost:3000")
public class FormDataController {

    @Autowired
    private FormDataRepository repository;

    @PostMapping
    public FormData saveFormData(@RequestBody FormData formData) {
        return repository.save(formData);
    }

    @GetMapping
    public List<FormData> getAllFormData() {
        return repository.findAll();
    }
}

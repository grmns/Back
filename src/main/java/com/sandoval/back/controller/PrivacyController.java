package com.sandoval.back.controller;

import com.sandoval.back.model.Privacy;
import com.sandoval.back.service.PrivacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/privacy")
public class PrivacyController {

    private final PrivacyService privacyService;

    @Autowired
    public PrivacyController(PrivacyService privacyService) {
        this.privacyService = privacyService;
    }

    @GetMapping("/all")
    public List<Privacy> getAllPrivacies() {
        return privacyService.getAllPrivacies();
    }

    // Puedes agregar más métodos de controlador según sea necesario
}

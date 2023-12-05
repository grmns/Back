package com.sandoval.back.controller;

import com.sandoval.back.model.Visibility;
import com.sandoval.back.service.VisibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visibility")
public class VisibilityController {

    private final VisibilityService visibilityService;

    @Autowired
    public VisibilityController(VisibilityService visibilityService) {
        this.visibilityService = visibilityService;
    }

    @GetMapping("/all")
    public List<Visibility> getAllVisibilities() {
        return visibilityService.getAllVisibilities();
    }

    // Puedes agregar más métodos de controlador según sea necesario
}

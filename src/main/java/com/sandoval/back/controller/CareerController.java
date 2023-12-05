package com.sandoval.back.controller;

import com.sandoval.back.model.Career;
import com.sandoval.back.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/career")
public class CareerController {

    private final CareerService careerService;

    @Autowired
    public CareerController(CareerService careerService) {
        this.careerService = careerService;
    }

    @GetMapping("/all")
    public List<Career> getAllCareers() {
        return careerService.getAllCareers();
    }

    // Puedes agregar más métodos de controlador según sea necesario
}

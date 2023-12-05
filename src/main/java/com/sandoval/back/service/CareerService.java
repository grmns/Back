package com.sandoval.back.service;

import com.sandoval.back.model.Career;
import com.sandoval.back.repository.CareerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CareerService {

    private final CareerRepo careerRepo;

    @Autowired
    public CareerService(CareerRepo careerRepo) {
        this.careerRepo = careerRepo;
    }

    public List<Career> getAllCareers() {
        return careerRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}

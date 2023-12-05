package com.sandoval.back.service;

import com.sandoval.back.model.Privacy;
import com.sandoval.back.repository.PrivacyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrivacyService {

    private final PrivacyRepo privacyRepo;

    @Autowired
    public PrivacyService(PrivacyRepo privacyRepo) {
        this.privacyRepo = privacyRepo;
    }

    public List<Privacy> getAllPrivacies() {
        return privacyRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}

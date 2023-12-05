package com.sandoval.back.service;

import com.sandoval.back.model.Visibility;
import com.sandoval.back.repository.VisibilityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VisibilityService {

    private final VisibilityRepo visibilityRepo;

    @Autowired
    public VisibilityService(VisibilityRepo visibilityRepo) {
        this.visibilityRepo = visibilityRepo;
    }

    public List<Visibility> getAllVisibilities() {
        return visibilityRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}

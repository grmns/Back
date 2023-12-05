package com.sandoval.back.service;

import com.sandoval.back.model.ActionRegister;
import com.sandoval.back.repository.ActionRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActionRegisterService {

    private final ActionRegisterRepo actionRegisterRepo;

    @Autowired
    public ActionRegisterService(ActionRegisterRepo actionRegisterRepo) {
        this.actionRegisterRepo = actionRegisterRepo;
    }

    public List<ActionRegister> getAllActionRegisters() {
        return actionRegisterRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}

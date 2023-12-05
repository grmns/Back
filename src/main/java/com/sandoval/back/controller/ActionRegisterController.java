package com.sandoval.back.controller;

import com.sandoval.back.model.ActionRegister;
import com.sandoval.back.service.ActionRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/action_register")
public class ActionRegisterController {

    private final ActionRegisterService actionRegisterService;

    @Autowired
    public ActionRegisterController(ActionRegisterService actionRegisterService) {
        this.actionRegisterService = actionRegisterService;
    }

    @GetMapping("/all")
    public List<ActionRegister> getAllActionRegisters() {
        return actionRegisterService.getAllActionRegisters();
    }

    // Puedes agregar más métodos de controlador según sea necesario
}

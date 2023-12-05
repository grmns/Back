package com.sandoval.back.controller;

import com.sandoval.back.model.ReactionRegister;
import com.sandoval.back.service.ReactionRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reaction_register")
public class ReactionRegisterController {

    private final ReactionRegisterService reactionRegisterService;

    @Autowired
    public ReactionRegisterController(ReactionRegisterService reactionRegisterService) {
        this.reactionRegisterService = reactionRegisterService;
    }

    @GetMapping("/all")
    public List<ReactionRegister> getAllReactionRegisters() {
        return reactionRegisterService.getAllReactionRegisters();
    }

    // Puedes agregar más métodos de controlador según sea necesario
}

package com.sandoval.back.service;

import com.sandoval.back.model.ReactionRegister;
import com.sandoval.back.repository.ReactionRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReactionRegisterService {

    private final ReactionRegisterRepo reactionRegisterRepo;

    @Autowired
    public ReactionRegisterService(ReactionRegisterRepo reactionRegisterRepo) {
        this.reactionRegisterRepo = reactionRegisterRepo;
    }

    public List<ReactionRegister> getAllReactionRegisters() {
        return reactionRegisterRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}

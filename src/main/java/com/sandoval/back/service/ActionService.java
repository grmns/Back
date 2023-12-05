package com.sandoval.back.service;

import com.sandoval.back.model.Action;
import com.sandoval.back.repository.ActionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActionService {

    private final ActionRepo actionRepo;

    @Autowired
    public ActionService(ActionRepo actionRepo) {
        this.actionRepo = actionRepo;
    }

    public List<Action> getAllActions() {
        return actionRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}

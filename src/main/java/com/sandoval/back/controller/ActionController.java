package com.sandoval.back.controller;

import com.sandoval.back.model.Action;
import com.sandoval.back.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/action")
public class ActionController {

    private final ActionService actionService;

    @Autowired
    public ActionController(ActionService actionService) {
        this.actionService = actionService;
    }

    @GetMapping("/all")
    public List<Action> getAllActions() {
        return actionService.getAllActions();
    }

    // Puedes agregar más métodos de controlador según sea necesario
}

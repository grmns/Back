package com.sandoval.back.controller;

import com.sandoval.back.dto.ReactionRegisterDTO;
import com.sandoval.back.exception.PostNotFoundException;
import com.sandoval.back.model.Post;
import com.sandoval.back.repository.PostRepo;
import com.sandoval.back.service.ReactionRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reactions")
public class ReactionRegisterController {

    private final ReactionRegisterService reactionRegisterService;
    private final PostRepo postRepo; // Agregado

    @Autowired
    public ReactionRegisterController(ReactionRegisterService reactionRegisterService, PostRepo postRepo) {
        this.reactionRegisterService = reactionRegisterService;
        this.postRepo = postRepo; // Inyectar PostRepo
    }

    @PostMapping("/toggle-like")
    public ResponseEntity<String> toggleLike(@RequestBody ReactionRegisterDTO reactionDTO) {
        reactionRegisterService.toggleLike(reactionDTO);
        return new ResponseEntity<>("Operación realizada exitosamente", HttpStatus.OK);
    }
}

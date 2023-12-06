package com.sandoval.back.service;

import com.sandoval.back.dto.ReactionRegisterDTO;
import com.sandoval.back.exception.PostNotFoundException;
import com.sandoval.back.exception.ReactionNotFoundException;
import com.sandoval.back.exception.UserNotFoundException;
import com.sandoval.back.model.Post;
import com.sandoval.back.model.ReactionRegister;
import com.sandoval.back.model.User;
import com.sandoval.back.repository.PostRepo;
import com.sandoval.back.repository.ReactionRegisterRepo;
import com.sandoval.back.repository.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReactionRegisterService {

    private final ReactionRegisterRepo reactionRegisterRepo;
    private final UserRepo userRepo;
    private final PostRepo postRepo;

    @Autowired
    public ReactionRegisterService(ReactionRegisterRepo reactionRegisterRepo, UserRepo userRepo, PostRepo postRepo) {
        this.reactionRegisterRepo = reactionRegisterRepo;
        this.userRepo = userRepo;
        this.postRepo = postRepo;
    }

    @Transactional
    public void toggleLike(ReactionRegisterDTO reactionDTO) {
        // Obtener el usuario y el post
        User user = userRepo.findById(reactionDTO.getUserId())
                .orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
        Post post = postRepo.findById(reactionDTO.getPostId())
                .orElseThrow(() -> new PostNotFoundException("Post no encontrado"));

        // Verificar si la reacción ya existe
        if (reactionRegisterRepo.existsByUserAndPost(user, post)) {
            // Si la reacción existe, verificar el valor de 'like' en DTO
            if (reactionDTO.getLike() != null && !reactionDTO.getLike()) {
                // Si 'like' es false, entonces quitar el like (eliminar la reacción)
                ReactionRegister existingReaction = reactionRegisterRepo.findByUserAndPost(user, post)
                        .orElseThrow(() -> new ReactionNotFoundException("La reacción no existe"));
                reactionRegisterRepo.delete(existingReaction);
            }
            // Si 'like' es true o null, no hacer nada, ya que el usuario no quiere quitar el like
        } else {
            // Si la reacción no existe y 'like' es true, agregarla
            if (reactionDTO.getLike() != null && reactionDTO.getLike()) {
                ReactionRegister newReaction = new ReactionRegister(true, post, user);
                reactionRegisterRepo.save(newReaction);
            }
            // Si 'like' es false o null, no hacer nada, ya que el usuario no quiere dar like
        }
    }

}

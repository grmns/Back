package com.sandoval.back.service;

import com.sandoval.back.dto.CommentDTO;
import com.sandoval.back.mapper.CommentMapper;
import com.sandoval.back.model.Comment;
import com.sandoval.back.model.Post;
import com.sandoval.back.model.User;
import com.sandoval.back.repository.CommentRepo;
import com.sandoval.back.repository.PostRepo;
import com.sandoval.back.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {

    private final CommentRepo commentRepo;
    private final UserRepo userRepo;
    private final PostRepo postRepo;

    @Autowired
    public CommentService(CommentRepo commentRepo, UserRepo userRepo, PostRepo postRepo) {
        this.commentRepo = commentRepo;
        this.userRepo = userRepo;
        this.postRepo = postRepo;
    }

    public void addComment(CommentDTO commentDTO) {
        // Obtener el usuario y el post
        User user = userRepo.findById(commentDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        Post post = postRepo.findById(commentDTO.getPostId())
                .orElseThrow(() -> new RuntimeException("Post no encontrado"));

        // Crear la entidad Comment
        Comment comment = new Comment();
        comment.setText(commentDTO.getText());
        comment.setPublicationDateTime(LocalDateTime.now());
        comment.setPost(post);
        comment.setUser(user);

        // Guardar el comentario en la base de datos
        commentRepo.save(comment);
    }

    public List<CommentDTO> getAllComments() {
        List<Comment> comments = commentRepo.findAll();
        return comments.stream()
                .map(CommentMapper::mapToDTO)
                .collect(Collectors.toList());
    }

}

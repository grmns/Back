package com.sandoval.back.service;

import com.sandoval.back.dto.CommentDTO;
import com.sandoval.back.dto.PostDTO;
import com.sandoval.back.mapper.CommentMapper;
import com.sandoval.back.model.Category;
import com.sandoval.back.model.Comment;
import com.sandoval.back.model.Post;
import com.sandoval.back.model.User;
import com.sandoval.back.repository.CategoryRepo;
import com.sandoval.back.repository.PostRepo;
import com.sandoval.back.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostRepo postRepo;
    private final UserRepo userRepo;
    private final CategoryRepo categoryRepo;

    @Autowired
    public PostService(PostRepo postRepo, UserRepo userRepo, CategoryRepo categoryRepo) {
        this.postRepo = postRepo;
        this.userRepo = userRepo;
        this.categoryRepo = categoryRepo;
    }

    public void createPost(PostDTO postDTO) {
        // Obtener el usuario y la categoría
        User user = userRepo.findById(postDTO.getUserId()).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        Category category = categoryRepo.findById(postDTO.getCategoryId()).orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        // Crear la entidad Post
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setContext(postDTO.getContext());
        post.setImage(postDTO.getImage());
        post.setPublicationDateTime(LocalDateTime.now());
        post.setUser(user);
        post.setCategory(category);

        // Guardar el post en la base de datos
        postRepo.save(post);
    }

    public void editPost(Long postId, PostDTO postDTO) {
        // Obtener el post existente por ID
        Optional<Post> optionalPost = postRepo.findById(postId);

        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setTitle(postDTO.getTitle());
            post.setContext(postDTO.getContext());
            post.setImage(postDTO.getImage());
            post.setPublicationDateTime(LocalDateTime.now());

            // Actualizar el post en la base de datos
            postRepo.save(post);
        } else {
            throw new RuntimeException("Post no encontrado");
        }
    }


    public void deletePost(Long postId) {
        // Verificar si el post existe
        if (postRepo.existsById(postId)) {
            // Eliminar el post de la base de datos
            postRepo.deleteById(postId);
        } else {
            throw new RuntimeException("Post no encontrado");
        }
    }

    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    public Optional<Post> getPostById(Long postId) {
        return postRepo.findById(postId);
    }

    public List<Post> getPostsByCategory(Long categoryId) {
        // Aquí podrías agregar validaciones adicionales si es necesario
        Category category = categoryRepo.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        return postRepo.findByCategory(category);
    }

    public List<Post> getPostsByUser(Long userId) {
        // Aquí podrías agregar validaciones adicionales si es necesario
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        return postRepo.findByUser(user);
    }

    public List<CommentDTO> getCommentsByPostId(Long postId) {
        Post post = postRepo.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post no encontrado"));

        List<Comment> comments = post.getComments();
        return comments.stream()
                .map(CommentMapper::mapToDTO)
                .collect(Collectors.toList());
    }


}

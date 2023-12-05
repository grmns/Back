package com.sandoval.back.repository;

import com.sandoval.back.model.Category;
import com.sandoval.back.model.Post;
import com.sandoval.back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findByCategory(Category category);

    List<Post> findByUser(User user);
}



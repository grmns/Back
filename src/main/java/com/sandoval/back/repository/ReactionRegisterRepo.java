package com.sandoval.back.repository;

import com.sandoval.back.model.Post;
import com.sandoval.back.model.ReactionRegister;
import com.sandoval.back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ReactionRegisterRepo extends JpaRepository<ReactionRegister, Long> {
    boolean existsByUserAndPost(User user, Post post);
    Optional<ReactionRegister> findByUserAndPost(User user, Post post);
}



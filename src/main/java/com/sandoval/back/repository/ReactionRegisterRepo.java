package com.sandoval.back.repository;

import com.sandoval.back.model.ReactionRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRegisterRepo extends JpaRepository<ReactionRegister, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

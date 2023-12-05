package com.sandoval.back.repository;

import com.sandoval.back.model.ActionRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRegisterRepo extends JpaRepository<ActionRegister, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

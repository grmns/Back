package com.sandoval.back.repository;

import com.sandoval.back.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepo extends JpaRepository<Action, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

package com.sandoval.back.repository;

import com.sandoval.back.model.Visibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisibilityRepo extends JpaRepository<Visibility, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

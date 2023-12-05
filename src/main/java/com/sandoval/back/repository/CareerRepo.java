package com.sandoval.back.repository;

import com.sandoval.back.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerRepo extends JpaRepository<Career, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

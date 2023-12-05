package com.sandoval.back.repository;

import com.sandoval.back.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

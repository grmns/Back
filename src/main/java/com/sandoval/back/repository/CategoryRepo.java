package com.sandoval.back.repository;

import com.sandoval.back.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

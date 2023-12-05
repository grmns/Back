package com.sandoval.back.repository;

import com.sandoval.back.model.Privacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivacyRepo extends JpaRepository<Privacy, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

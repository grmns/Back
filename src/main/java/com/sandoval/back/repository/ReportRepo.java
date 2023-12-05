package com.sandoval.back.repository;

import com.sandoval.back.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends JpaRepository<Report, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

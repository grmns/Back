package com.sandoval.back.repository;

import com.sandoval.back.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

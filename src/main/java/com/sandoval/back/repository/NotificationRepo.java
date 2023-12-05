package com.sandoval.back.repository;

import com.sandoval.back.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends JpaRepository<Notification, Long> {
    // Puedes agregar métodos personalizados según sea necesario
}

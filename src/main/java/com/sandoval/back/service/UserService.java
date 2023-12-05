package com.sandoval.back.service;

import com.sandoval.back.dto.UserDTO;
import com.sandoval.back.model.Account;
import com.sandoval.back.model.Career;
import com.sandoval.back.model.User;
import com.sandoval.back.repository.AccountRepo;
import com.sandoval.back.repository.CareerRepo;
import com.sandoval.back.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;
    private final AccountRepo accountRepo; // Necesitarás el repositorio correspondiente
    private final CareerRepo careerRepo;   // Necesitarás el repositorio correspondiente

    @Autowired
    public UserService(UserRepo userRepo, AccountRepo accountRepo, CareerRepo careerRepo) {
        this.userRepo = userRepo;
        this.accountRepo = accountRepo;
        this.careerRepo = careerRepo;
    }

    public void registerUser(UserDTO userDTO) {
        // Validar los datos del usuario antes de almacenarlos
        if (userDTO == null || userDTO.getEmail() == null || userDTO.getEmail().isEmpty()) {
            // Puedes lanzar una excepción, devolver un código de error, etc.
            throw new IllegalArgumentException("El correo electrónico es obligatorio");
        }

        // Verificar si el correo electrónico ya está registrado
        if (userRepo.existsByEmail(userDTO.getEmail())) {
            // Puedes lanzar una excepción, devolver un código de error, etc.
            throw new IllegalArgumentException("El correo electrónico ya está registrado");
        }

        // Crear una instancia de la entidad User
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setCelNumber(userDTO.getCelNumber());
        user.setPerfilUser(userDTO.getPerfilUser());

        // Obtener la cuenta y carrera correspondientes desde la base de datos
        Account account = accountRepo.findById(userDTO.getIdAccount())
                .orElseThrow(() -> new IllegalArgumentException("No se encontró la cuenta con el ID proporcionado"));
        Career career = careerRepo.findById(userDTO.getIdCareer())
                .orElseThrow(() -> new IllegalArgumentException("No se encontró la carrera con el ID proporcionado"));

        // Establecer las relaciones
        user.setAccount(account);
        user.setCareer(career);

        // Guardar el usuario en la base de datos
        userRepo.save(user);
    }
}

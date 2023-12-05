package com.sandoval.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "cel_number")
    private String celNumber;

    @Lob
    @Column(name = "perfil_user", columnDefinition = "LONGBLOB")
    private byte[] perfilUser;  // Cambiado a un array de bytes para representar una imagen

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_career")
    private Career career;

    public User(Long idUser, String firstName, String lastName, String email, String celNumber, byte[] perfilUser, Account account, Career career) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.celNumber = celNumber;
        this.perfilUser = perfilUser;
        this.account = account;
        this.career = career;
    }

    public User() {

    }

    public User(String firstName, String lastName, String email, String celNumber, byte[] perfilUser, Account account, Career career) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.celNumber = celNumber;
        this.perfilUser = perfilUser;
        this.account = account;
        this.career = career;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(String celNumber) {
        this.celNumber = celNumber;
    }

    public byte[] getPerfilUser() {
        return perfilUser;
    }

    public void setPerfilUser(byte[] perfilUser) {
        this.perfilUser = perfilUser;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
}

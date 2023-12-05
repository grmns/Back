package com.sandoval.back.dto;

public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String celNumber;
    private byte[] perfilUser;  // Cambiado a un array de bytes para representar una imagen
    private Long idAccount;  // Podría ser el ID de la cuenta asociada
    private Long idCareer;   // Podría ser el ID de la carrera asociada

    // Constructores, getters y setters

    public UserDTO() {
    }

    public UserDTO(String firstName, String lastName, String email, String celNumber, byte[] perfilUser, Long idAccount, Long idCareer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.celNumber = celNumber;
        this.perfilUser = perfilUser;
        this.idAccount = idAccount;
        this.idCareer = idCareer;
    }

    // Getters y setters

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

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public Long getIdCareer() {
        return idCareer;
    }

    public void setIdCareer(Long idCareer) {
        this.idCareer = idCareer;
    }
}

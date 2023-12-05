import jakarta.persistence.*;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private Long idAdmin;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "cel_number")
    private String celNumber;

    @Lob
    @Column(name = "perfil_user")
    private byte[] perfilUser;  // Cambiado a un array de bytes para representar una imagen

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    public Admin() {
    }

    public Admin(String firstName, String lastName, String email, String celNumber, byte[] perfilUser, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.celNumber = celNumber;
        this.perfilUser = perfilUser;
        this.account = account;
    }

    public Long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
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
    // Puedes agregar constructores, métodos, etc., según sea necesario
}

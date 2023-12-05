package com.sandoval.back.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "action_register")
public class ActionRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_action_register")
    private Long idActionRegister;

    @ManyToOne
    @JoinColumn(name = "id_action")
    private Action action;

    @Column(name = "action_date")
    private LocalDateTime actionDate;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;

    public ActionRegister(Long idActionRegister, Action action, LocalDateTime actionDate, Post post, Admin admin) {
        this.idActionRegister = idActionRegister;
        this.action = action;
        this.actionDate = actionDate;
        this.post = post;
        this.admin = admin;
    }

    public ActionRegister() {

    }

    public Long getIdActionRegister() {
        return idActionRegister;
    }

    public void setIdActionRegister(Long idActionRegister) {
        this.idActionRegister = idActionRegister;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public LocalDateTime getActionDate() {
        return actionDate;
    }

    public void setActionDate(LocalDateTime actionDate) {
        this.actionDate = actionDate;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}

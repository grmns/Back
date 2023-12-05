package com.sandoval.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "action")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_action")
    private Long idAction;

    @Column(name = "progress")
    private String progress;

    public Action(Long idAction, String progress) {
        this.idAction = idAction;
        this.progress = progress;
    }

    public Action() {

    }

    public Long getIdAction() {
        return idAction;
    }

    public void setIdAction(Long idAction) {
        this.idAction = idAction;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}

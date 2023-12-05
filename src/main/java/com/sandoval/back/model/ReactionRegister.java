package com.sandoval.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reaction_register")
public class ReactionRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reaction_register")
    private Long idReactionRegister;

    @Column(name = "like")
    private boolean like;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    public ReactionRegister(Long idReactionRegister, boolean like, User user, Post post) {
        this.idReactionRegister = idReactionRegister;
        this.like = like;
        this.user = user;
        this.post = post;
    }

    public Long getIdReactionRegister() {
        return idReactionRegister;
    }

    public void setIdReactionRegister(Long idReactionRegister) {
        this.idReactionRegister = idReactionRegister;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}

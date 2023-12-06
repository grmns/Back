package com.sandoval.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reaction_register")
public class ReactionRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reaction_register")
    private Long idReactionRegister;

    @Column(name = "reaction_like")
    private Boolean like;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;


    public ReactionRegister() {
    }

    public ReactionRegister(Boolean like, Post post, User user) {
        this.like = like;
        this.post = post;
        this.user = user;
    }

    public Long getIdReactionRegister() {
        return idReactionRegister;
    }

    public void setIdReactionRegister(Long idReactionRegister) {
        this.idReactionRegister = idReactionRegister;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

package com.sandoval.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "visibility")
public class Visibility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visibility")
    private Long idVisibility;

    @ManyToOne
    @JoinColumn(name = "id_privacy")
    private Privacy privacy;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    public Visibility(Long idVisibility, Privacy privacy, Post post) {
        this.idVisibility = idVisibility;
        this.privacy = privacy;
        this.post = post;
    }

    public Visibility() {

    }

    public Long getIdVisibility() {
        return idVisibility;
    }

    public void setIdVisibility(Long idVisibility) {
        this.idVisibility = idVisibility;
    }

    public Privacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}

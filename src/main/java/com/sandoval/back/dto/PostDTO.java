package com.sandoval.back.dto;

import java.time.LocalDateTime;

public class PostDTO {
    private String title;
    private String context;
    private byte[] image;
    private LocalDateTime publicationDateTime;
    private Long userId; // ID del usuario que realiza el post
    private Long categoryId; // ID de la categoría del post

    public PostDTO() {
    }

    public PostDTO(String title, String context, byte[] image, LocalDateTime publicationDateTime, Long userId, Long categoryId) {
        this.title = title;
        this.context = context;
        this.image = image;
        this.publicationDateTime = publicationDateTime;
        this.userId = userId;
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public byte[] getImage() {
        return image;
    }

    public LocalDateTime getPublicationDateTime() {
        return publicationDateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getCategoryId() {
        return categoryId;
    }
}

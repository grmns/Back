package com.sandoval.back.dto;

import java.time.LocalDateTime;

public class CommentDTO {

    private Long idComment;
    private String text;
    private LocalDateTime publicationDateTime;
    private Long postId;
    private Long userId;

    public CommentDTO() {
    }

    public CommentDTO(Long idComment, String text, LocalDateTime publicationDateTime, Long postId, Long userId) {
        this.idComment = idComment;
        this.text = text;
        this.publicationDateTime = publicationDateTime;
        this.postId = postId;
        this.userId = userId;
    }

    public Long getIdComment() {
        return idComment;
    }

    public void setIdComment(Long idComment) {
        this.idComment = idComment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getPublicationDateTime() {
        return publicationDateTime;
    }

    public void setPublicationDateTime(LocalDateTime publicationDateTime) {
        this.publicationDateTime = publicationDateTime;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}

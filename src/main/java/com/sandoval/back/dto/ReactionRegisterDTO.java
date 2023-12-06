package com.sandoval.back.dto;

public class ReactionRegisterDTO {

    private Long userId;
    private Long postId;
    private Boolean like;

    public ReactionRegisterDTO() {
    }

    public ReactionRegisterDTO(Long userId, Long postId, Boolean like) {
        this.userId = userId;
        this.postId = postId;
        this.like = like;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }
}

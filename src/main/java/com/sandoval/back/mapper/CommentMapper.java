package com.sandoval.back.mapper;

import com.sandoval.back.dto.CommentDTO;
import com.sandoval.back.model.Comment;

public class CommentMapper {

    public static CommentDTO mapToDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setIdComment(comment.getIdComment());
        commentDTO.setText(comment.getText());
        commentDTO.setPublicationDateTime(comment.getPublicationDateTime());
        commentDTO.setPostId(comment.getPost().getIdPost());
        commentDTO.setUserId(comment.getUser().getIdUser());
        return commentDTO;
    }
}

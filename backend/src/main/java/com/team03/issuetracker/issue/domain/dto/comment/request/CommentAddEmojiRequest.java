package com.team03.issuetracker.issue.domain.dto.comment.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommentAddEmojiRequest {

    private final Long commentId;
    private final Long emojiId;
}
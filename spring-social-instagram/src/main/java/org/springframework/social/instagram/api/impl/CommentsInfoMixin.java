package org.springframework.social.instagram.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.social.instagram.api.Comment;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class CommentsInfoMixin {
    @JsonCreator
    CommentsInfoMixin(
            @JsonProperty("count") int total,
            @JsonProperty("data") List<Comment> list) {}
    

}

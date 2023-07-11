package dev.likelion.summer.dto;

import dev.likelion.summer.entity.Post;
import dev.likelion.summer.resquest.PostRequest;
import dev.likelion.summer.resquest.PostUpdateRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PostDto {
    private Long postId;

    private String header;

    private String contents;

    private Boolean scope;

    private String place;

    public static PostDto toPostDto(PostRequest postRequest) {
        return PostDto.builder()
                .header(postRequest.getHeader())
                .contents(postRequest.getContents())
                .scope(postRequest.getScope())
                .place(postRequest.getPlace())
                .build();
    }

    public static PostDto toPostDto(PostUpdateRequest postUpdateRequest) {
        return PostDto.builder()
                .header(postUpdateRequest.getHeader())
                .contents(postUpdateRequest.getContents())
                .scope(postUpdateRequest.getScope())
                .postId(postUpdateRequest.getPostId())
                .place(postUpdateRequest.getPlace())
                .build();
    }
}

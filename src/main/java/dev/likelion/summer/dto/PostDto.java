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

    private String sentence; // 공유게시판 업로드용

    private String date; // 날짜

    public static PostDto toPostDto(PostRequest postRequest) {
        return PostDto.builder()
                .header(postRequest.getHeader())
                .contents(postRequest.getContents())
                .scope(postRequest.getScope())
                .place(postRequest.getPlace())
                .date(postRequest.getDate())
                .sentence(postRequest.getSentence())
                .build();
    }

    public static PostDto toPostDto(PostUpdateRequest postUpdateRequest) {
        return PostDto.builder()
                .header(postUpdateRequest.getHeader())
                .contents(postUpdateRequest.getContents())
                .scope(postUpdateRequest.getScope())
                .postId(postUpdateRequest.getPostId())
                .place(postUpdateRequest.getPlace())
                .sentence(postUpdateRequest.getSentence())
                .date(postUpdateRequest.getDate())
                .build();
    }
}

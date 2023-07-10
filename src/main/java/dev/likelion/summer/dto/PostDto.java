package dev.likelion.summer.dto;

import dev.likelion.summer.resquest.PostRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PostDto {
    private String header;

    private String contents;

    private Boolean scope;

    public static PostDto toPostDto(PostRequest postRequest) {
        return PostDto.builder()
                .header(postRequest.getHeader())
                .contents(postRequest.getContents())
                .scope(postRequest.getScope())
                .build();
    }
}

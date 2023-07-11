package dev.likelion.summer.response;

import dev.likelion.summer.entity.Post;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PostResponse {
    private Long postId;

    private String header;

    private String contents;

    private Boolean scope;

    private String place;

    private String sentence; // 공유게시판 업로드용

    private String date; // 날짜

    public static PostResponse toPostResponse(Post post) {
        return PostResponse.builder()
                .postId(post.getPostId())
                .header(post.getHeader())
                .contents(post.getContents())
                .scope(post.getScope())
                .place(post.getPlace())
                .sentence(post.getSentence())
                .date(post.getDate())
                .build();
    }
}

package dev.likelion.summer.resquest;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PostUpdateRequest {
    private String header;

    private String contents;

    private Boolean scope;

    private Long postId;

    private String place;

    private String sentence; // 공유게시판 업로드용

    private String date; // 날짜
}

package dev.likelion.summer.resquest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PostRequest {
    private String header;

    private String contents;

    private Boolean scope;

    private Long userId;

    private String place;

    private String sentence; // 공유게시판 업로드용

    private String date; // 날짜
}

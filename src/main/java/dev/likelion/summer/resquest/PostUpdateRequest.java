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
}

package dev.likelion.summer.resquest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PostRequest {
    private String header;

    private String contents;

    private Boolean scope;
}

package dev.likelion.summer.resquest;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class UserUpdateRequest {
    private String sentence;

    private String nickName;

    private String email;
}

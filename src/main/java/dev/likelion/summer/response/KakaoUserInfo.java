package dev.likelion.summer.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class KakaoUserInfo {
    private Long userId;

    private String name;

    private String email;

    private String phoneNumber;

    private String birthDay;
}

package dev.likelion.summer.resquest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserRequest { // 이것만 받아오고, 나머지는 카카오 로그인을 통해서 받아와서 구현
    private String userId;

    private String passWord;
}

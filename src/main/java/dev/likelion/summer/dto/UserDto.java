package dev.likelion.summer.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String accessToken;

    private String refreshToken;

    private String email;

    private String nickName;

    public static UserDto toUserDto(String accessToken, String refreshToken, String email, String nickName) {
        return UserDto.builder()
                .email(email)
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .nickName(nickName)
                .build();
    }
}

package dev.likelion.summer.entity;

import dev.likelion.summer.dto.UserDto;
import dev.likelion.summer.entity.commons.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> postList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserSavedPost> userSavedPostList;

    private String nickName;

    private String accessToken;

    private String refreshToken;

    private String email; // 카카오 로그인을 통해서 받아오기 / 없어도 상관 X

    public static User toUser(UserDto userDto) {
        return User.builder()
                .email(userDto.getEmail())
                .accessToken(userDto.getAccessToken())
                .refreshToken(userDto.getRefreshToken())
                .nickName(userDto.getNickName())
                .build();
    }
}

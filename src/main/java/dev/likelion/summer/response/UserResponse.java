package dev.likelion.summer.response;

import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.entity.User;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long userId;

    private String nickName;

    private String email;

    private String sentence;

    private List<PostDto> postDtoList;

    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .email(user.getEmail())
                .userId(user.getUserId())
                .nickName(user.getNickName())
                .sentence(user.getSentence())
                .postDtoList(user.getPostList().stream().map(PostDto::toPostDto).collect(Collectors.toList()))
                .build();
    }
}

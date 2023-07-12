package dev.likelion.summer.entity;

import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.entity.commons.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private Picture picture;

    private String header; // 제목

    private String contents; // 본문

    private Boolean scope; // 공개 여부

    private String place; // 장소

    private String sentence; // 공유게시판 업로드용

    private String date; // 날짜

    public static Post toPost(PostDto postDto, User user, Picture picture) {
        return Post.builder()
                .picture(picture)
                .header(postDto.getHeader())
                .contents(postDto.getContents())
                .scope(postDto.getScope())
                .user(user)
                .place(postDto.getPlace())
                .date(postDto.getDate())
                .sentence(postDto.getSentence())
                .build();
    }

}

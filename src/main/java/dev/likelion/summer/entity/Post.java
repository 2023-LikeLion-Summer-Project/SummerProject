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

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Picture> pictureList;

    private String header; // 제목

    private String contents; // 본문

    private Boolean scope; // 공개 여부

    private String place; // 장소

    public static Post toPost(PostDto postDto, User user) {
        return Post.builder()
                .header(postDto.getHeader())
                .contents(postDto.getContents())
                .scope(postDto.getScope())
                .user(user)
                .place(postDto.getPlace())
                .build();
    }

}

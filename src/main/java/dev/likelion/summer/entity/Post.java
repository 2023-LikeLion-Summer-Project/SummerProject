package dev.likelion.summer.entity;

import dev.likelion.summer.entity.commons.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @ManyToOne
    private User user;

    @OneToMany
    private List<Picture> pictureList;

    private String header; // 제목

    private String contents; // 본문

    private Boolean scope; // 공개 여부

}

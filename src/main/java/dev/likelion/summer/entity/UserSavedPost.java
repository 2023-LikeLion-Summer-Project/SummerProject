package dev.likelion.summer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserSavedPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long savedPostId;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

}

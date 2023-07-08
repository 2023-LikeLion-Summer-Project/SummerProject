package dev.likelion.summer.entity;

import dev.likelion.summer.entity.commons.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.security.PrivateKey;
import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseEntity {
    @Id
    private String userId; // 사용자가 직접 입력 해줘야 함

    @OneToMany
    private List<Post> postList;

    private String name; // 카카오 로그인으로 받아오기

    private String passWord; // 사용자가 직접 입력 해줘야 함

    private String email; // 카카오 로그인을 통해서 받아오기 / 없어도 상관 X

    private String birthDay; // 카카오 로그인을 통해서 받아오기 / 없어도 상관 X

    private String phoneNumber; // 카카오 로그인을 통해서 받아오기 / 없어도 상관 X

}

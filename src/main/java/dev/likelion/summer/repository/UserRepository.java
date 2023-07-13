package dev.likelion.summer.repository;

import dev.likelion.summer.entity.Post;
import dev.likelion.summer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Long> {
    @Query("select r from User r where r.accessToken = :token")
    User findByUserToken(String token);

    @Query("select r from User r where r.kakaoUserId = :kakaoUserId")
    User findByKakaoUserId(Long kakaoUserId);
}

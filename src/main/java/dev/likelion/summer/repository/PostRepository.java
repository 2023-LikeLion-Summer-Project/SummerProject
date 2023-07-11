package dev.likelion.summer.repository;

import dev.likelion.summer.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("select r from Post r where r.user.userId = :userId")
    List<Post> findAllByUserId(Long userId);
}

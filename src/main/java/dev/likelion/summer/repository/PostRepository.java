package dev.likelion.summer.repository;

import dev.likelion.summer.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

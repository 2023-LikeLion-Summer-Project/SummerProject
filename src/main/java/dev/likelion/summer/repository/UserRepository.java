package dev.likelion.summer.repository;

import dev.likelion.summer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
}

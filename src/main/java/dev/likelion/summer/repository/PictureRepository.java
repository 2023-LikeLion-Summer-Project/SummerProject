package dev.likelion.summer.repository;

import dev.likelion.summer.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}

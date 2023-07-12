package dev.likelion.summer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pictureId;

    @OneToOne
    private Post post; // 게시물과 다대일 관계

    private String filePath;

    private String fileName;

    public static Picture toPicture(String filePath, String fileName) {
        return Picture.builder()
                .fileName(fileName)
                .filePath(filePath)
                .build();
    }
}

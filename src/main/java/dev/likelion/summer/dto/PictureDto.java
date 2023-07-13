package dev.likelion.summer.dto;

import dev.likelion.summer.entity.Picture;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PictureDto {
    private String filePath;

    private String fileName;

    public static PictureDto toPictureDto(String filePath, String fileName) {
        return PictureDto.builder()
                .filePath(filePath)
                .fileName(fileName)
                .build();
    }

    public static PictureDto toPictureDto(Picture picture) {
        return PictureDto.builder()
                .filePath(picture.getFilePath())
                .fileName(picture.getFileName())
                .build();
    }
}

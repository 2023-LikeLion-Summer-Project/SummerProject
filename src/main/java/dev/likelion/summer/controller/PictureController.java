package dev.likelion.summer.controller;

import dev.likelion.summer.service.PictureService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/register/action")
    public void boardRegisterAction(MultipartHttpServletRequest multiRequest) {
        try {
            pictureService.uploadFile(multiRequest);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                logger.error("#Exception Message : {}", e.getMessage());
            }
        }
    }

}

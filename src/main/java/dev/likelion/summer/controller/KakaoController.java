package dev.likelion.summer.controller;

import dev.likelion.summer.service.KakaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/add/kakao")
public class KakaoController {
    private final KakaoService kakaoService;
}
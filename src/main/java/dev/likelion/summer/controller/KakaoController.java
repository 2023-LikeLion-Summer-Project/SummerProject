package dev.likelion.summer.controller;

import dev.likelion.summer.service.KakaoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@Getter
@Setter
@RequestMapping("/user/add/kakao")
public class KakaoController {
    private final KakaoService kakaoService;

    @GetMapping("/login")
    public ModelAndView loginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("kakaoLogin");

        return modelAndView;
    }

    @GetMapping("/permission")
    public void kakaoLogin(@RequestParam(value = "code", required = false) String code) throws IOException {
        String accessToken = kakaoService.getAccessToken(code);

        HashMap<String, Object> userInfo = kakaoService.getUserInfo(accessToken);
        // access token 받은 이후 사용자 정보 받아오는 것을 어디에 처리할 것인지?

    }
}
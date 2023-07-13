package dev.likelion.summer.controller;

import dev.likelion.summer.dto.UserDto;
import dev.likelion.summer.entity.User;
import dev.likelion.summer.service.KakaoService;
import dev.likelion.summer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class RedirectController {
    private final KakaoService kakaoService;
    private final UserService userService;


    @GetMapping("/add/kakao/permission")
    public String kakaoLogin(@RequestParam(value = "code", required = false) String code) throws IOException, URISyntaxException {
        String[] tokens = kakaoService.getAccessToken(code);
        String accessToken = tokens[0];
        String refreshToken = tokens[1];


        HashMap<String, Object> userInfo = kakaoService.getUserInfo(accessToken);
        User tempUser = userService.findByKakaoId((Long) userInfo.get("userKakaoId"));

        if(tempUser != null) {
            tempUser.setAccessToken(accessToken);
            userService.findByKakaoId((Long) userInfo.get("userKakaoId")).setAccessToken(accessToken);
        } else {
            userAdd(accessToken, refreshToken, userInfo.get("email").toString(), userInfo.get("nickname").toString(),
                    (Long) userInfo.get("userKakaoId"));
        }


//        if(userService.getUserById(userService.findByKakaoId((Long) userInfo.get("userKakaoId"))).getKakaoUserId() != null) {
//            userService.getUserById(userService.findByKakaoId((Long)userInfo.get("userKakaoId"))).setAccessToken(accessToken);
//        } else {
//            userAdd(accessToken, refreshToken, userInfo.get("email").toString(), userInfo.get("nickname").toString(),
//                    (Long) userInfo.get("userKakaoId"));
//        }
        return "redirect:http://localhost:3000/main";
    }

    @PostMapping("/add")
    public ResponseEntity<Long> userAdd(String accessToken, String refreshToken, String email, String nickname, Long userKakaoId) {
        Long userId = userService.addUser(UserDto.toUserDto(accessToken, refreshToken, email, nickname, userKakaoId));

        return ResponseEntity.ok(userId);
    }

    @RequestMapping(value = "/logout/{id}")
    public String userLogout(@PathVariable("id") Long id) {
        String userToken = userService.getUserById(id).getAccessToken();
        System.out.println(userToken);


        kakaoService.kakaoLogout(userToken);
        userService.getUserById(id).setAccessToken(null);

        System.out.println(userService.getUserById(id).getAccessToken());

        return "redirect:http://localhost:3000/login";
    }
}

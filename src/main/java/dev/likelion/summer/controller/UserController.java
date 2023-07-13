package dev.likelion.summer.controller;

import dev.likelion.summer.dto.UserDto;
import dev.likelion.summer.entity.User;
import dev.likelion.summer.response.UserResponse;
import dev.likelion.summer.resquest.UserUpdateRequest;
import dev.likelion.summer.service.KakaoService;
import dev.likelion.summer.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")

public class UserController {
    private final UserService userService;
    private final KakaoService kakaoService;
    @GetMapping("/add/kakao/login")
    public ModelAndView loginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("kakaoLogin");

        return modelAndView;
    }

//    @GetMapping("/add/kakao/permission")
//    public void kakaoLogin(@RequestParam(value = "code", required = false) String code) throws IOException, URISyntaxException {
//        String[] tokens = kakaoService.getAccessToken(code);
//        String accessToken = tokens[0];
//        String refreshToken = tokens[1];
//
//        HashMap<String, Object> userInfo = kakaoService.getUserInfo(accessToken);
//        // access token 받은 이후 사용자 정보 받아오는 것을 어디에 처리할 것인지?
//
//        if(userService.findByKakaoId((Long) userInfo.get("userKakaoId")) != null) {
//
//        } else {
//            userAdd(accessToken, refreshToken, userInfo.get("email").toString(), userInfo.get("nickname").toString(),
//                    (Long) userInfo.get("userKakaoId"));
//        }

//    }

//    public String forward() throws URISyntaxException {
//        URI forwardUri = new URI("http://localhost:3000/main");
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject(forwardUri, String.class);
//    }

//    public ResponseEntity<?> redirect() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(URI.create("/"));
//        return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
//    }

    @GetMapping("/login/{accessToken}")
    public ResponseEntity<UserResponse> userLogin(@PathVariable String accessToken) {
        User getUser = userService.getUserByToken(accessToken);

        if(getUser.getUserId() != null) {
            return ResponseEntity.ok(UserResponse.toUserResponse(getUser));
        }

        return (ResponseEntity<UserResponse>) ResponseEntity.notFound();
    }

//    @PostMapping("/add")
//    public ResponseEntity<Long> userAdd(String accessToken, String refreshToken, String email, String nickname, Long userKakaoId) {
//        Long userId = userService.addUser(UserDto.toUserDto(accessToken, refreshToken, email, nickname, userKakaoId));
//
//        return ResponseEntity.ok(userId);
//    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);

        return ResponseEntity.ok(null);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Long> updateUser(@PathVariable Long id, @RequestBody UserUpdateRequest userUpdateRequest) {
        Long userId = userService.updateUserId(id, UserDto.toUserDto(userUpdateRequest));

        return ResponseEntity.ok(userId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id) {
        User getUser = userService.getUserById(id);

        return ResponseEntity.ok(UserResponse.toUserResponse(getUser));
    }
}

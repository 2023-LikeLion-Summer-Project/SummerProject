package dev.likelion.summer.controller;

import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.resquest.PostRequest;
import dev.likelion.summer.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/add")
    public ResponseEntity<Long> addPost(@RequestBody PostRequest postRequest) {
        Long postId = postService.addPost(PostDto.toPostDto(postRequest));

        return ResponseEntity.ok(postId);
    }
}

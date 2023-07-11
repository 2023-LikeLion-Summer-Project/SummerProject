package dev.likelion.summer.controller;

import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.entity.Post;
import dev.likelion.summer.response.PostResponse;
import dev.likelion.summer.resquest.PostRequest;
import dev.likelion.summer.resquest.PostUpdateRequest;
import dev.likelion.summer.service.PostService;
import dev.likelion.summer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/add")
    public ResponseEntity<Long> addPost(@RequestBody PostRequest postRequest) {
        Long postId = postService.addPost(PostDto.toPostDto(postRequest), postRequest.getUserId());

        return ResponseEntity.ok(postId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PostResponse> getOnePost(@PathVariable Long id) {
        Post getPost = postService.getOnePost(id);
        PostResponse postResponse = PostResponse.toPostResponse(getPost);

        return ResponseEntity.ok(postResponse);
    }

    @GetMapping("/get/user/{id}")
    public ResponseEntity<List<PostResponse>> getPostByUserId(@PathVariable Long id) {
        List<PostResponse> postResponseList = postService.findPostByUserId(id).stream().map(PostResponse::toPostResponse).collect(Collectors.toList());

        return ResponseEntity.ok(postResponseList);
    }

    @PatchMapping("/update")
    public ResponseEntity<Void> updatePost(@RequestBody PostUpdateRequest postUpdateRequest) {
        postService.updatePost(PostDto.toPostDto(postUpdateRequest));

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        postService.deletePost(id);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/delete/user/{id}")
    public ResponseEntity<Void> deletePostByUser(@PathVariable Long id) {
        postService.deleteAllPostByUser(id);

        return ResponseEntity.ok(null);
    }
}

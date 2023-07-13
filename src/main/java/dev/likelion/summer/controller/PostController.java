package dev.likelion.summer.controller;

import dev.likelion.summer.dto.PictureDto;
import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.entity.Picture;
import dev.likelion.summer.entity.Post;
import dev.likelion.summer.response.PostResponse;
import dev.likelion.summer.resquest.PostRequest;
import dev.likelion.summer.resquest.PostUpdateRequest;
import dev.likelion.summer.service.PictureService;
import dev.likelion.summer.service.PostService;
import dev.likelion.summer.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;
    private final PictureService pictureService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE })
    public ResponseEntity<Long> addPost(@RequestPart(value = "post") PostRequest postRequest, @RequestPart(value = "picture") MultipartFile multiRequest) {
        PictureDto pictureDto = new PictureDto();
        try {
            pictureDto = pictureService.uploadFile(multiRequest);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                logger.error("#Exception Message : {}", e.getMessage());
            }
        }
        Picture picture = Picture.toPicture(pictureDto);
        Long pictureId = pictureService.savePicture(picture);

        Long postId = postService.addPost(PostDto.toPostDto(postRequest), postRequest.getUserId(), pictureService.getOnePicture(pictureId));


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

    @GetMapping("/get/scope")
    public ResponseEntity<List<PostResponse>> getPostByScope() {
        List<Post> postList = postService.getByScope();
        List<PostResponse> postResponseList = postList.stream().map(PostResponse::toPostResponse).collect(Collectors.toList());

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

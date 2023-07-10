package dev.likelion.summer.service;

import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.entity.Post;
import dev.likelion.summer.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Getter
@Setter
@AllArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Long addPost(PostDto postDto) {
        Post post = postRepository.save(Post.toPost(postDto));

        return post.getPostId();
    }

}

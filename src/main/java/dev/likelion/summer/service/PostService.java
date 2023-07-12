package dev.likelion.summer.service;

import dev.likelion.summer.dto.PostDto;
import dev.likelion.summer.entity.Picture;
import dev.likelion.summer.entity.Post;
import dev.likelion.summer.repository.PostRepository;
import dev.likelion.summer.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Transactional
    public Long addPost(PostDto postDto, Long userId, Picture picture) {
        Post post = postRepository.save(Post.toPost(postDto, userRepository.getById(userId), picture));

        return post.getPostId();
    }

    @Transactional
    public Post getOnePost(Long postId) {
        Post getPost = postRepository.getById(postId);

        return getPost;
    }

    @Transactional
    public List<Post> findPostByUserId(Long id) {
        List<Post> postList = postRepository.findAllByUserId(id);

        return postList;
    }

    @Transactional
    public void updatePost(PostDto postDto) {
        Post updatePost = postRepository.getById(postDto.getPostId());

        updatePost.setHeader(postDto.getHeader());
        updatePost.setContents(postDto.getContents());
        updatePost.setScope(postDto.getScope());
    }

    @Transactional
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }

    @Transactional
    public void deleteAllPostByUser(Long userId) {
        List<Post> deleteList = findPostByUserId(userId);

        for(Post temp : deleteList) {
            deletePost(temp.getPostId());
        }
    }

    @Transactional
    public List<Post> getByScope() {
        List<Post> postList = postRepository.findAllByScopeTrue(true);

        return postList;
    }

}

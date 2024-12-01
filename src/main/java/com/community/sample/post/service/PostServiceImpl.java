package com.community.sample.post.service;

import com.community.sample.post.dto.PostRequest;
import com.community.sample.post.model.PostEntity;
import com.community.sample.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public long createPost(PostRequest request) {
        PostEntity postEntity = PostEntity.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .author(request.getAuthor())
                .password(request.getPassword())
                .createdAt(OffsetDateTime.now())
                .build();

        PostEntity newEntity = postRepository.save(postEntity);

        return newEntity.getId();
    }
}

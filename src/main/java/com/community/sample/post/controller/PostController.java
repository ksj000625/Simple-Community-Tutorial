package com.community.sample.post.controller;

import com.community.sample.post.dto.PostRequest;
import com.community.sample.post.dto.PostResponse;
import com.community.sample.post.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("")
    public long createPost(@RequestBody PostRequest request) {
        log.info(request.getTitle());
        log.info(request.getContent());

        return postService.createPost(request);
    }

    @GetMapping("")
    public ResponseEntity<List<PostResponse>> getPostList() {
        return ResponseEntity.ok(postService.getPostList());
    }
}

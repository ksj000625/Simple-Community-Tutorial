package com.community.sample.post.service;

import com.community.sample.post.dto.PostRequest;
import com.community.sample.post.dto.PostResponse;

import java.util.List;

public interface PostService {
    long createPost(PostRequest request);

    List<PostResponse> getPostList();
}

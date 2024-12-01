package com.community.sample.post.service;

import com.community.sample.post.dto.PostRequest;

public interface PostService {
    public long createPost(PostRequest request);
}

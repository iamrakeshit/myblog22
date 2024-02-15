package com.myblog.myblog22.service;

import com.myblog.myblog22.payload.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    PostDto createPost(PostDto postDto);
}

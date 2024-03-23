package com.shiva.postservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @GetMapping(value= "/{postId}")
    public Posts GetPosts(@PathVariable("postId") String postId){
        Posts postOne = new Posts(postId, "Post Description-"+postId);
        return postOne;
    }
}

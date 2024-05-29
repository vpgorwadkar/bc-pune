package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class PostController {
	
	@GetMapping("/api/jsonpl/{id}")
	public Post getData(@PathVariable("id") final String id )
	{
		String url="http://jsonplaceholder.typicode.com/posts/"+id;
		RestClient rc = RestClient.create();
		Post post = rc.get().uri(url).retrieve().body(Post.class);
		
		return post;
	}

}

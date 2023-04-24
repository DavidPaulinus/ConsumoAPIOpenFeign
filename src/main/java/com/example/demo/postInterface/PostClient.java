package com.example.demo.postInterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.DTO.PostDTO;

@FeignClient(name = "posts", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {
	
	@GetMapping(value = "/posts")
	List<PostDTO> getLista();
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.PostDTO;
import com.example.demo.postInterface.PostClient;

@RestController
@RequestMapping("/aaa")
public class Controller {
	@Autowired
	private PostClient pos;
	
	@GetMapping("/post")
	public List<PostDTO> getList(){
		return pos.getLista();
	}
}

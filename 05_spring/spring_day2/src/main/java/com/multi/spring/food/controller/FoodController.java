package com.multi.spring.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.multi.spring.movie.model.dto.MovieDTO;
//model에 담긴 키값
@SessionAttributes("loginUser")	// Model에 Attribute 추가할때 자동으로 설정된 키값을 세션에 등록 시키는 기능

@Controller
@RequestMapping("/food") 
public class FoodController {
	
	@GetMapping("/food")
	public void foodForm() {
		
	}
	
//	@GetMapping("/choice")
//	public String selectFood(FoodDTO bag) {
//		System.out.
//	}
	

}
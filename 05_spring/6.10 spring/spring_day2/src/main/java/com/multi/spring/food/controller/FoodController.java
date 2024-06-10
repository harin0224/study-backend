package com.multi.spring.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.food.model.dto.FoodDTO;

@Controller
@RequestMapping("/food")
public class FoodController {


	@GetMapping("/food")
	public void foodForm() {

	}
	@GetMapping("/choice")
	public String selectFood(FoodDTO bag) {
		System.out.println(bag);
		String like = bag.getLike();
		String dislike = bag.getDislike();
		if (like.equals("라면")) {
			return "/food/like";
		} 
		if (dislike.equals("커피")) {
			return "/food/dislike";
		} 
		if(like.equals("아무거나")) {
			return "redirect:/food/food";
		}else {
			return "redirect:/food/food";
		}
	}
}

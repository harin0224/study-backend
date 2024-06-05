package com.multi.spring.page.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.multi.spring.page.model.dto.PageDTO;
//model에 담긴 키값
@SessionAttributes("loginUser")	// Model에 Attribute 추가할때 자동으로 설정된 키값을 세션에 등록 시키는 기능

@Controller
@RequestMapping("/page") 
public class PageController {
	
	
	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@RequestMapping("/bbsmain")
	public void pageMain() {
	
	}
	
	@GetMapping("/bbsAll")
	public void selectAll(PageDTO pageDto, Model model) {
		pageDto.setStartEnd(pageDto.getPage());
		List<BoardDTO> list = boardService.selectAll(pageDto);
	
	}


}
package com.multi.spring.page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.page.model.dto.BoardDTO;
import com.multi.spring.page.model.dto.PageDTO;
import com.multi.spring.page.service.BoardService;


@Controller
@RequestMapping("/page")
public class PageController {
	
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}
	

	
	@GetMapping("/bbsmain")
	public void pageMain() {
	
	}
	
	@GetMapping("bbsall") // - 하이픈 , 소문자권장 
	public void  selectAll(PageDTO pageDto, Model model) {
	
		pageDto.setStartEnd(pageDto.getPage());
		
		List<BoardDTO> list = boardService.selectAll(pageDto);
		int count = boardService.selectCount();

		//System.out.println(list);
		int pages = count / 10 + 1; //전체 페이지 개수 구하기
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
		
	}
	@GetMapping("bbsall2")
	public void selectAll2(PageDTO pageDto, Model model) {
	
		pageDto.setStartEnd(pageDto.getPage());
		
		List<BoardDTO> list = boardService.selectAll(pageDto);
		int count = boardService.selectCount();

		//System.out.println(list);
		int pages = count / 10 + 1; //전체 페이지 개수 구하기
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	
	
	@GetMapping("bbslist")
	public void selectbbsList2(PageDTO pageDto, Model model) {
	
		pageDto.setStartEnd(pageDto.getPage());
		
		List<BoardDTO> list = boardService.selectAll(pageDto);

		model.addAttribute("list", list);
		
	}
}

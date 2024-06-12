package com.multi.test.book.controller;

import java.util.List;

import com.multi.test.book.model.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.test.book.model.dao.BookDAO;
import com.multi.test.book.model.dto.BookDTO;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookDAO dao;

	@GetMapping("/book")
	public void foodForm() {

	}
	
	@GetMapping("/list") //list
	public void list(Model model) {
		List<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	
	@GetMapping("/one") //one?id=4
	public void one(int id, Model model) {
		BookDTO dto = dao.one(id);
	
		model.addAttribute("dto", dto);
	}
	
	@PostMapping("/update")
	public String update(BookDTO dto) {
		int result = dao.update(dto);
		if(result == 1) {
			return "/book/update";
		}else {
			return "redirect:/book/book";
		}
	}
	
	@PostMapping("/insert")
	public String insert(BookDTO dto) {
		int result = dao.insert(dto);
		if(result == 1) {
			return "/book/insert";
		}else {
			return "redirect:/book/book";
		}
	}
	

	@GetMapping("/delete") //one?id=4
	public String delete(int id, Model model) {
		int dto = dao.delete(id);

		return "redirect:/book/book";
	}
	
}

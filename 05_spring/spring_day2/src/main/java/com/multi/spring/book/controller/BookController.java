//package com.multi.spring.book.controller;
//
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.multi.spring.book.model.dto.BookDTO;
//
//
//@Controller
//@RequestMapping("/book") 
//public class BookController {
//	
//	@GetMapping("/book")
//	public void foodForm() {
//		
//	}
//	
//	@GetMapping("/list")
//	public void list(Model model) {
//		List<BookDTO> list = dao.list();
//		model.addAttribute("list", list);
//	}
//
//
//}
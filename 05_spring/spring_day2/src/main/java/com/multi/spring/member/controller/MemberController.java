package com.multi.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.member.model.dto.MemberDTO;
import com.multi.spring.member.service.MemberService;

@Controller
@RequestMapping("/member") 
public class MemberController {
	
	// 생성자 주입
	private final MemberService memberService;

	// --------------------------------------------------------- //@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@RequestMapping("/member")
	public void memberMain() {
	
	}
	
	@RequestMapping("/delete_form")
	public void deleteForm() {
			
	}
	
	@RequestMapping("/insert_form")
	public void insertForm() {
			
	}
	
	@RequestMapping("/one_form")
	public void oneForm() {
			
	}
	
	@RequestMapping("/update_form")
	public void updateForm() {
			
	}
	
	@PostMapping("/insert")
	public String insertMember(MemberDTO memberDTO , HttpSession session) throws Exception {
		System.out.println("insert ==> " + memberDTO);
		memberService.insertMember(memberDTO);
		session.setAttribute("msg", "회원가입성공");
		return "redirect:/member/member";
	}
	
	@GetMapping("/list")
	public void selectList(Model model) throws Exception {
		List<MemberDTO> list = memberService.selectList();
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/delete")
	public String deleteMember(String id) throws Exception {
		memberService.deleteMember(id);
		return "redirect:/member/member";
	}
	
	@PostMapping("/update")
	public String updateMember(MemberDTO memberDTO , HttpSession session) throws Exception {
		System.out.println("update ==> " + memberDTO);
		memberService.updateMember(memberDTO);
		session.setAttribute("msg", "회원수정성공");
		return "redirect:/member/member";
	}
	
	@GetMapping("/one")
	public void selectMember(String id, Model model) throws Exception {
		MemberDTO dto = memberService.selectMember(id);
		
		model.addAttribute("dto", dto);
	}
}

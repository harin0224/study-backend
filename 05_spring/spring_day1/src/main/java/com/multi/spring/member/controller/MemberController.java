package com.multi.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.spring.member.model.dao.MemberDAO;
import com.multi.spring.member.model.dto.MemberDTO;

@Controller
public class MemberController {

	// 필드 주입
//	@Autowired	// 빈스캐닝을 통해 해당 인터페이스를 구현한 클래스(구현체)중 @component + 기능 (@Service, @Repository) 로 등록되어있는 빈을 찾아서 자동으로 주입(DI) 해준다.	
//	MemberDAO memberDAO;	//MemberDAO memberDAO = new MemberDAO();

	
	// 생성자 주입
	private final MemberDAO memberDAO;
	//--------------------------------------------------------- //@Autowired 생략 가능
	 public MemberController(MemberDAO memberDAO) {
		 this.memberDAO =memberDAO; 
	 }
	 
	 @RequestMapping("/member")
	 public void member() {
		 
	 }
	 
	 
	
	
	
	@RequestMapping("/insert")	//@@RequestMapping hadelMapping에 등록
	public void insert(@ModelAttribute MemberDTO memberDTO) {	// 커맨드 객체, command
		
		System.out.println(memberDTO);
		memberDAO.insert(memberDTO);
		
		
		
		
		//return "insert"; 이름 같아서	// viewresolver에 의해 앞뒤로 경로와 확장자를 붙여서 클라이언트에 보여줄수있게 처리됨
		
	}
	
	@RequestMapping("/login")
	public String login(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		
		int result = 1; // 0 or 1 결과값 에따라
		if (result == 1) {
			return "ok";
		}else {
			return "redirect:member";	// redirect로 url 적음
			// return "redirect:WEB-INF/views/member.jsp"; //return "redirect:member.jsp"; 이동 불가능
		}
	}
	
	@RequestMapping("/delete")
	//public void delete(@RequestParam String id) {	//@RequestParam 생략하려면 매개변수명과 파라미터명을 동일하겍 줘야한다.
	public void delete(@RequestParam("id") String writer){
		System.out.println("받은 아이디는 " + writer);
		
	}
	
	

}

package com.multi.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.multi.spring.member.model.dto.MemberDTO;
import com.multi.spring.member.service.MemberService;
//model에 담긴 키값
@SessionAttributes("loginUser")	// Model에 Attribute 추가할때 자동으로 설정된 키값을 세션에 등록 시키는 기능

@Controller
@RequestMapping("/member") // class 위의 매핑	-> class 전체의 root
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

	@RequestMapping("/member")// method 위의 매핑	-> (/member)/member
	public void memberMain() {//member.jsp 불러옴 어노테이션 기능
	
	}
	
	@RequestMapping("/delete_form")
	public void deleteForm() {
			
	}
	
	@RequestMapping("/insert_form")
	public void insertForm() {
		// insert_form.jsp 불러오기
			
	}
	
	@RequestMapping("/one_form")
	public void oneForm() {
			
	}
	
	@RequestMapping("/update_form")
	public void updateForm() {
			
	}
	
	@RequestMapping("/enrollForm")
	public String enrollForm() {
		return "member/enroll_form";
		// 화면 그대로 띄워줌
	}
	
	@PostMapping("/insert")
	public String insertMember(MemberDTO memberDTO , HttpSession session) throws Exception {
		System.out.println("insert ==> " + memberDTO);
		memberService.insertMember(memberDTO);
		session.setAttribute("msg", "회원가입성공");
		return "redirect:/member/member";
		// 주소값을 찾아가며 그 안의 컨트롤러를 다시 한번 되짚는다?
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
	
//	// http 세션을 이용한 방식
//	@PostMapping("/login")
//	public String loginMember(MemberDTO m, HttpSession session) {
//		System.out.println("insert ==> " + m);
//		
//		try {
//			MemberDTO dto = memberService.loginMember(m);
//			// 제대로 됐으면 세션에 담아주고 홈으로 가서 메뉴 뜨기
//			session.setAttribute("loginUser", dto);
//			return "redirect:/";
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			// 제대로 안됐으면 에러페이지
//			return "common/errorPage";
//		}
//		
//	}
//	
//	@RequestMapping("/logout")
//	public String logout(HttpSession session) {
//		session.invalidate();
//		return "redirect:/";
//	}
	
	@PostMapping("/login")
	public String loginMember(MemberDTO m, Model model) {
		System.out.println("insert ==> " + m);
		
		try {
			MemberDTO dto = memberService.loginMember(m);
			model.addAttribute("loginUser", dto);	// 모델에 담아주고 제일위에 @SessionAttributes에 키값 설정
			return "redirect:/";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "common/errorPage";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete(); //현재 SessionAttributes 에 의해 저장된 오브젝트를 제거
		return "redirect:/";
	}
}

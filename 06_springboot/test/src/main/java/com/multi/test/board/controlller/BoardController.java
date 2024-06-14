package com.multi.test.board.controlller;





import com.multi.test.board.model.dto.BoardDTO;
import com.multi.test.board.service.BoardService;
import com.multi.test.member.model.dto.MemberDTO;
import com.multi.test.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/board") 
public class BoardController {
	
	// 생성자 주입
	private final MemberService memberService;
	private final BoardService boardService;

	// --------------------------------------------------------- //@Autowired
	public BoardController(MemberService memberService, BoardService boardService) {
		this.memberService = memberService;
        this.boardService = boardService;
    }
	
	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@RequestMapping("/member")
	public void memberMain() {
	
	}
	
	@RequestMapping("/bbs_delete_form")
	public void deleteForm() {
			
	}
	
	@RequestMapping("/insert_form")
	public void insertForm() {
			
	}

//	@GetMapping("/bbs_one_form")
//	public void oneForm() {
//
//	}

	@RequestMapping("/bbs_one_form")
	public String dataTest(Model model) throws Exception {
		ArrayList<BoardDTO> boardDTO = boardService.selectList();
		model.addAttribute("bag", boardDTO);
		return "main/main";
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

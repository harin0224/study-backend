package com.multi.spring.song.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.song.model.dto.SongDTO;
import com.multi.spring.song.service.SongService;


@Controller
@RequestMapping("/song")
public class SongController {
	
	private final SongService songService;

	// --------------------------------------------------------- //@Autowired
	public SongController(SongService songService) {
		this.songService = songService;
	}
	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	
	@GetMapping("/select")
	public void selectForm(int num, SongDTO songDTO,  Model model) {
		songDTO.setNum(num); // num 값을 songDTO에 설정
		System.out.println(num);
        SongDTO result = songService.selectOne(songDTO);
        System.out.println(result);
		model.addAttribute("dto", result);
	}
	
	@GetMapping("/select_All")
	public List<SongDTO> selectAllForm(Model model) {
        List<SongDTO> list = songService.selectList();
		model.addAttribute("list", list);
		System.out.println(list);
		return list;
	}
	
}

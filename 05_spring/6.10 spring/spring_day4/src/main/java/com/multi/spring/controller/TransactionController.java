package com.multi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.model.dto.BbsDTO;
import com.multi.spring.model.dto.MemberDTO;

@Controller
public class TransactionController {

	@Autowired
	TransactionService service;

	@RequestMapping("transaction.do")
	public void transaction(MemberDTO  vo, BbsDTO vo2, Model model)  {
		// 트랜잭션(처리의 단위, 회원가입-->게시판글쓰기)처리할 수 있는 기능의 메서드 필요
		int result = 0;
		try {
			result = service.tran(vo, vo2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("결과 받은값>> " + result);
		if (result == 1) {
			model.addAttribute("result", "모든 db처리 성공!! commit됨");
		} else {
			model.addAttribute("result", "db처리 중 에러가 발생!! rollback됨");

		}
	}
}

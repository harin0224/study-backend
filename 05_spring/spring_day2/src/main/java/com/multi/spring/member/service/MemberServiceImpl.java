package com.multi.spring.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.multi.spring.member.model.dao.MemberDAO;
import com.multi.spring.member.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	private final MemberDAO memberDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// 빈으로 등록 후 필드로 선언해서 주입
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

//	@Override
//	public void insertMember(MemberDTO memberDTO) throws Exception {
//		int result = memberDAO.insertMember(sqlSession, memberDTO);
//		if(result < 0) {
//			throw new Exception("회원가입에 실패 하였습니다");
//		}
//
//	}

	@Override
	public List<MemberDTO> selectList() throws Exception {
		List<MemberDTO> list = memberDAO.selectList(sqlSession);
		return list;
	}
	
	@Override
	public void deleteMember(String id) throws Exception {
		int result = memberDAO.deleteMember(sqlSession, id);
		if(result < 0) {
			throw new Exception("회원삭제에 실패 하였습니다");
		}

	}
	
	@Override
	public void updateMember(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.updateMember(sqlSession, memberDTO);
		if(result < 0) {
			throw new Exception("회원수정에 실패 하였습니다");
		}
	}
	
	@Override
	public MemberDTO selectMember(String id) throws Exception {
		MemberDTO dto = memberDAO.selectMember(sqlSession, id);
		return dto;
	}

	// 암호화 처리 전
//	@Override
//	public MemberDTO loginMember(MemberDTO m) throws Exception {
//		MemberDTO loginUser = memberDAO.loginMember(sqlSession, m);
//		
//		if(loginUser == null) {
//			throw new Exception("loginUser 정보 확인, 로그인 실패");
//		}
//		return loginUser;
//	}
	
	//암호화 처리 후
	@Override
	public MemberDTO loginMember(MemberDTO m) throws Exception {
		MemberDTO loginUser = memberDAO.loginMember(sqlSession, m);
		
		if(loginUser == null) {
			throw new Exception("loginUser 정보 확인, 로그인 실패");
		}if(!bCryptPasswordEncoder.matches(m.getPw(), loginUser.getPw())) {
			//일치하면 true, 일치하지 않으면 false 넘어옴
			throw new Exception("암호 불일치");
			
		}
		return loginUser;
		
	}
	
	@Override
	public void insertMember(MemberDTO m) throws Exception {
		
		System.out.println("암호화 전: " + m.getPw());
		String encpw = bCryptPasswordEncoder.encode(m.getPw());
		System.out.println("암호화 후: " + encpw);
		
		m.setPw(encpw);
		int result = memberDAO.insertMember(sqlSession, m);
		if(result < 0) {
			throw new Exception("회원가입에 실패 하였습니다");
		}

	}
	
	
}

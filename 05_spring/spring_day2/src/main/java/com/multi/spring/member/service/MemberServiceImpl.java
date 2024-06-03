package com.multi.spring.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.member.model.dao.MemberDAO;
import com.multi.spring.member.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	private final MemberDAO memberDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public void insertMember(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.insertMember(sqlSession, memberDTO);
		if(result < 0) {
			throw new Exception("회원가입에 실패 하였습니다");
		}

	}

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
	
}

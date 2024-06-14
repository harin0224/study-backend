package com.multi.test.member.service;

import com.multi.test.member.model.dto.MemberDTO;

import java.util.List;



public interface MemberService {

	void insertMember(MemberDTO memberDTO) throws Exception;

	List<MemberDTO> selectList() throws Exception;

	void deleteMember(String id) throws Exception;

	void updateMember(MemberDTO memberDTO) throws Exception;

	MemberDTO selectMember(String id) throws Exception;

	MemberDTO loginMember(MemberDTO m) throws Exception;

}

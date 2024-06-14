package com.multi.test.member.model.dao;

import java.util.List;

import com.multi.test.member.model.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	public int insertMember(SqlSessionTemplate sqlSession, MemberDTO memberDTO) {
		
		return sqlSession.insert("memberMapper.insertMember", memberDTO);
	}

	public List<MemberDTO> selectList(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated method stub
		return (List)sqlSession.selectList("memberMapper.selectList");
	}

	public int deleteMember(SqlSessionTemplate sqlSession, String id) {
		// TODO Auto-generated method stub
		return sqlSession.delete("memberMapper.deleteMember", id);
	}

	public int updateMember(SqlSessionTemplate sqlSession, MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		return sqlSession.insert("memberMapper.updateMember", memberDTO);
	}

	public MemberDTO selectMember(SqlSessionTemplate sqlSession, String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberMapper.selectMember" , id);
	}

	public MemberDTO loginMember(SqlSessionTemplate sqlSession, MemberDTO m) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberMapper.loginMember" , m);
	}

}

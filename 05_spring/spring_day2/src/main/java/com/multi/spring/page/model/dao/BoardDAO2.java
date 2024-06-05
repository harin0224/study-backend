package com.multi.spring.page.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.page.model.dto.BoardDTO;
import com.multi.spring.page.model.dto.PageDTO;

@Repository
public class BoardDAO2 {
	public List<BoardDTO> selectAll(SqlSessionTemplate sqlSession, PageDTO pageDto){
		return (List)sqlSession.selectList("boardMapper.selectAll", pageDto);
	}
	
	public int selectCount(SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("boardMapper2.selectCount");
	}

}

package com.multi.test.board.model.dao;

import java.util.ArrayList;

import com.multi.test.board.model.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDAO {

	public int insertBoard(SqlSessionTemplate sqlSession, BoardDTO boardDTO) {
		return sqlSession.insert("boardMapper.insertBoard", boardDTO);
	}

	public ArrayList<BoardDTO> selectList(SqlSessionTemplate sqlSession) {
	
		return (ArrayList) sqlSession.selectList("boardMapper.selectList");
	}

	public BoardDTO selectBoard(SqlSessionTemplate sqlSession, int no) {
	
		return sqlSession.selectOne("boardMapper.selectOne", no);
	}

	public int updateBoard(SqlSessionTemplate sqlSession, BoardDTO boardDTO) {
		return sqlSession.update("boardMapper.updateBoard", boardDTO);
	}

	public int deleteBorad(SqlSessionTemplate sqlSession, int no) {
		return sqlSession.delete("boardMapper.deleteBoard", no);
	}

}

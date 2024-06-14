package com.multi.test.board.service;



import com.multi.test.board.model.dao.BoardDAO;
import com.multi.test.board.model.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class BoardServiceImpl implements BoardService {
	private final BoardDAO boardDAO;
	private SqlSessionTemplate sqlSession;

	@Autowired
	public BoardServiceImpl(BoardDAO boardDAO, SqlSessionTemplate sqlSession) {
		super();
		this.boardDAO = boardDAO;
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertBoard(BoardDTO boardDTO) throws Exception {

		int result = boardDAO.insertBoard(sqlSession, boardDTO);
		return result;
	}

	@Override
	public ArrayList<BoardDTO> selectList() throws Exception {
		
		ArrayList<BoardDTO> list = boardDAO.selectList(sqlSession);
		return list;
	}

	@Override
	public BoardDTO selectBoard(int no) throws Exception {
		
		BoardDTO boardDTO = boardDAO.selectBoard(sqlSession, no);
		return boardDTO;
	}

	@Override
	public int updateBoard(BoardDTO boardDTO) throws Exception {
		int result = boardDAO.updateBoard(sqlSession, boardDTO);
		return result;
	}

	@Override
	public int deleteBorad(int no) throws Exception {
		int result = boardDAO.deleteBorad(sqlSession, no);
		return result;
	}

}

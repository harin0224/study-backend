package com.multi.test.board.service;

import com.multi.test.board.model.dto.BoardDTO;

import java.util.ArrayList;


public interface BoardService {
	int insertBoard(BoardDTO boardDTO) throws Exception;
	ArrayList<BoardDTO> selectList() throws Exception;
	BoardDTO selectBoard(int id) throws Exception;
	int updateBoard(BoardDTO boardDTO) throws Exception;
	int deleteBorad(int no) throws Exception;
}

package com.multi.spring.board.service;

import java.util.ArrayList;

import com.multi.spring.board.model.dto.BoardDTO;

public interface BoardService {
	int insertBoard(BoardDTO boardDTO) throws Exception;
	ArrayList<BoardDTO> selectList() throws Exception;
	BoardDTO selectBoard(int id) throws Exception;
	int updateBoard(BoardDTO boardDTO) throws Exception;
	int deleteBorad(int no) throws Exception;
}

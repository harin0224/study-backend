package com.multi.spring.file.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.multi.spring.file.model.dao.FileDAO;
import com.multi.spring.movie.model.dto.MovieDTO;

public class FileServiceImpl implements FileService {
	
	// 필드 주입을 걸어준다? 생성자로
	
	@Autowired
	private FileDAO fileDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void insertMovie(MovieDTO movieDTO) throws Exception {
		int result = fileDAO.insertMovie(sqlSession, movieDTO);
		if(result<0) {
			throw new Exception("등록 실패");
		}

	}

}

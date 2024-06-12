package com.multi.test.file.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.test.file.model.dao.FileDAO;
import com.multi.test.movie.model.dto.MovieDTO;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private FileDAO fileDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public void insertMovie(MovieDTO movieDTO) throws Exception {
		int result = fileDAO.insertMovie(sqlSession, movieDTO);

		if(result < 0) {
			throw new Exception("등록실패");
		}
	}

}

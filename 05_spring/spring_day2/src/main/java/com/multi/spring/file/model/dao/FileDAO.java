package com.multi.spring.file.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.multi.spring.movie.model.dto.MovieDTO;

public class FileDAO {

	public int insertMovie(SqlSessionTemplate sqlSession, MovieDTO movieDTO) {
		// TODO Auto-generated method stub
		return sqlSession.insert("movieMapper.insertMovie", movieDTO);
	}

}

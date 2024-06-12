package com.multi.test.file.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.test.movie.model.dto.MovieDTO;

@Repository
public class FileDAO {

	public int insertMovie(SqlSessionTemplate sqlSession, MovieDTO movieDTO) {
		// TODO Auto-generated method stub
		return sqlSession.insert("movieMapper.insertMovie",movieDTO);
	}

}

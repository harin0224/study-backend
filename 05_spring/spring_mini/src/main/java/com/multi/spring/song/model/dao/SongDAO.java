package com.multi.spring.song.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.song.model.dto.SongDTO;



@Repository
public class SongDAO {

	public SongDTO selectOne(SqlSessionTemplate sqlSession, SongDTO songDTO) {
		return sqlSession.selectOne("songMapper.selectSong", songDTO);
	}
	
	public List<SongDTO> selectList(SqlSessionTemplate sqlSession) {
		return (List) sqlSession.selectList("songMapper.selectSongAll");
	}

}

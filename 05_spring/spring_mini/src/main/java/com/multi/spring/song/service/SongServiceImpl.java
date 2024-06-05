package com.multi.spring.song.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.song.model.dao.SongDAO;
import com.multi.spring.song.model.dto.SongDTO;

@Service
public class SongServiceImpl implements SongService {
	private final SongDAO songDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public SongServiceImpl(SongDAO songDAO) {
		this.songDAO = songDAO;
	}

	// 전체 검색
	@Override
	public List<SongDTO> selectList() {
		// TODO Auto-generated method stub
		List<SongDTO> list = songDAO.selectList(sqlSession);
		return list;
	}
	
	// 하나 검색
	@Override
	public SongDTO selectOne(SongDTO songDTO) {
		// TODO Auto-generated method stub
		SongDTO result = songDAO.selectOne(sqlSession, songDTO);
		return result;
	}

}

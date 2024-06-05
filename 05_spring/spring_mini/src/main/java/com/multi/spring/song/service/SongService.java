package com.multi.spring.song.service;

import java.util.List;

import com.multi.spring.song.model.dto.SongDTO;

public interface SongService {
 
	SongDTO selectOne(SongDTO songDTO);

	List<SongDTO> selectList();

}

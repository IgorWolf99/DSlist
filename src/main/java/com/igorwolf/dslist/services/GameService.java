package com.igorwolf.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.igorwolf.dslist.dto.GameDTO;
import com.igorwolf.dslist.dto.GameMinDTO;
import com.igorwolf.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id){
		var result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
}

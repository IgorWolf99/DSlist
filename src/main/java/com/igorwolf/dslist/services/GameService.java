package com.igorwolf.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorwolf.dslist.dto.GameMinDTO;
import com.igorwolf.dslist.entities.Game;
import com.igorwolf.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
}

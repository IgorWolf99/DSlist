package com.igorwolf.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.igorwolf.dslist.dto.GameListDTO;
import com.igorwolf.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	public GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		var result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	public GameListService() {}

	public GameListService(GameListRepository gameListRepository) {
		this.gameListRepository = gameListRepository;
	}

	public GameListRepository getGameListRepository() {
		return gameListRepository;
	}

	public void setGameListRepository(GameListRepository gameListRepository) {
		this.gameListRepository = gameListRepository;
	}
	
	
	
}

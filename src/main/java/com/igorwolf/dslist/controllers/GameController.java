package com.igorwolf.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igorwolf.dslist.dto.GameDTO;
import com.igorwolf.dslist.dto.GameMinDTO;
import com.igorwolf.dslist.entities.Game;
import com.igorwolf.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	public GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return gameService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Object> saveGame(@RequestBody Game game) {
		Game savedGame = gameService.save(game);
	    String message = "Jogo adicionado com sucesso: " + savedGame.getTitle() + ", " + savedGame.getYear();
		return ResponseEntity.status(HttpStatus.CREATED).body(message);
	}
	
}

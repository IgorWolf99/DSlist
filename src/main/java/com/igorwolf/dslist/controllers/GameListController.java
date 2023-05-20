package com.igorwolf.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igorwolf.dslist.dto.GameListDTO;
import com.igorwolf.dslist.dto.GameMinDTO;
import com.igorwolf.dslist.services.GameListService;
import com.igorwolf.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	public GameListService gameListService;
	
	@Autowired
	public GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{id}/games")
	public List<GameMinDTO> findByList(@PathVariable Long id){
		return gameService.findByList(id);
	}
}

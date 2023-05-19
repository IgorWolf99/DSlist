package com.igorwolf.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

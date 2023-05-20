package com.igorwolf.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igorwolf.dslist.dto.GameListDTO;
import com.igorwolf.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

	@Autowired
	public GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
}

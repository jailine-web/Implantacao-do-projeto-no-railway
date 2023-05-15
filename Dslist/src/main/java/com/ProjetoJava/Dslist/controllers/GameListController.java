package com.ProjetoJava.Dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoJava.Dslist.DTO.GameListDTO;
import com.ProjetoJava.Dslist.DTO.GameMinDTO;
import com.ProjetoJava.Dslist.services.GameListService;
import com.ProjetoJava.Dslist.services.GameService;

@RestController// disponibiliza a API
@RequestMapping(value="/listas")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> buscarListas(){
		List<GameListDTO> games = gameListService.buscarTodosOsGames();
		return games;
	}
	
	@GetMapping(value = "/{idLista}/games")
	public List<GameMinDTO> buscarListas(@PathVariable Long idLista){
		List<GameMinDTO> listas = gameService.buscarPorListas(idLista);
		return listas;
	}
	
	
	
}

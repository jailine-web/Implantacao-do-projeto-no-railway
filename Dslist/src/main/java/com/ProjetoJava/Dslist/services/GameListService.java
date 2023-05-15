package com.ProjetoJava.Dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProjetoJava.Dslist.DTO.GameListDTO;
import com.ProjetoJava.Dslist.DTO.GameMinDTO;
import com.ProjetoJava.Dslist.entities.GameList;
import com.ProjetoJava.Dslist.repositories.GameListRepository;

@Service 
public class GameListService {

	@Autowired 
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> buscarTodosOsGames(){
		List<GameList> listaGames = gameListRepository.findAll();
		return listaGames.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
	
}

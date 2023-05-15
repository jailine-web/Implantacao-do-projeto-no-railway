package com.ProjetoJava.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoJava.Dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}

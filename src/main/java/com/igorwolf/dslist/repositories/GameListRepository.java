package com.igorwolf.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorwolf.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

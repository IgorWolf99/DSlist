package com.igorwolf.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	private Integer position;
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	public Belonging() {}

	public Belonging(Integer position, Game game, GameList list) {
		this.position = position;
		id.setGame(game);
		id.setGameList(list);
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}
	
	
}

package sk.spring.beans.musiciens;

import sk.spring.exception.JouerException;

public interface Joueur {
	void jouerMorceau() throws JouerException;
}

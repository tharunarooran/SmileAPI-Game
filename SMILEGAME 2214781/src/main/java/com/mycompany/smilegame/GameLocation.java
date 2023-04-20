/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smilegame;

import java.net.URL;

/**
 *
 * @author Tharun
 */

public class GameLocation {
	URL location = null; 
	int solution = -1;
	/**
	 * Location of the game and what is the solution to the game.
	 * @param location
	 * @param solution
	 */
	public GameLocation(URL location, int solution) {
		super();
		this.location = location;
		this.solution = solution;
	}
	/**
	 * The location of the game. 
	 * @return the location of the game.
	 */
	public URL getLocation() {
		return location;
	}

	/**
	 * @return The solution of the game.
	 */
	public int getSolution() {
		return solution;
	}
	
	
	
	

}

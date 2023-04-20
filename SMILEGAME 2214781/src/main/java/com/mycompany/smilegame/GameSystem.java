/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smilegame;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Tharun
 */
public class GameSystem {
    String userPlayer = null;
    
    public GameSystem(String Player){
                userPlayer= Player;
    }
    
    
    int counter=0;
    int score=0;
    GameAPI theGames = new GameAPI(); 
    GameLocation current = null; 
    
    
    public URL nextGame() {		
			try {
				current = theGames.getRandomGame();
				return current.getLocation(); 
			} catch (MalformedURLException e) {
				System.out.println("Something went wrong when trying to retrieve game "+counter+"!"); 
				e.printStackTrace();
				return null; 
			} 
    }
    public boolean checkSolution(URL game, int i) {
		if (i == current.getSolution()) {
			score++; 
			return true;
		} else {
			return false;
		}
	}
    
    public int getScore(){
        return score;
    }
            
}

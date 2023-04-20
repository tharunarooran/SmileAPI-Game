/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smilegame;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 *
 * @author Tharun
 */
public class GameAPI {
    public GameLocation getRandomGame() throws MalformedURLException {
                                 //SMILE API IMPLEMENTATION
		String callapi = "https://marcconrad.com/uob/smile/api.php?out=csv";
		String dataraw = readUrl(callapi); 
		String[] data = dataraw.split(","); 
		
		URL quest = new URL(data[0]); 
		int solution  = Integer.parseInt(data[1]);  
		
		return new GameLocation(quest, solution);
    
	}
    
    private static String readUrl(String urlString) {
		
	    try {

	        URL url = new URL(urlString);
	        InputStream inputStream = url.openStream();
	        ByteArrayOutputStream result = new ByteArrayOutputStream();
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = inputStream.read(buffer)) != -1) {
	            result.write(buffer, 0, length);
	        }	  
	        return result.toString("UTF-8");
	        
	    } catch (Exception e) {
	        System.out.println("An Error occured: "+e.toString());
	        e.printStackTrace();
	        return null; 
	    }            
          
    }
    

};

// SMILE API LINK WAS RECEIVED AS AN EXAMPLE FROM ASSESSMENT WE WERE GIVEN //
// INPUTSTREAM TO STRING CONVERSION LINK :https://www.baeldung.com/convert-input-stream-to-string //
package com.mygame.dao;

public class GameDAO {
		// class
		String cityName[]={"chennai","kolkata","delhi","mumbai"};
		//variable 
public void getcityName() {
		//method 
		//String cityName=Name;  
		for(int i=0;i<cityName.length;i++) 
			{
			System.out.println(cityName[i]);
			}
	  }
public static void main(String[]args){
		{
		  
			GameDao GameDaobj=new GameDao();
			GameDaobj.getcityName();
		         
		}
	}
            

	} 


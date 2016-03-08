/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author maxxl
 */
public class DisplayTemperature implements Observer, Display
{
   private int temperature=0;
   public DisplayTemperature(Observable obs)
   {
	obs.addObserver(this);
   }
   
   
   @Override
   public void update(Observable o, Object arg)
   {
	if(o instanceof WetherData)
	{
	   WetherData Data = (WetherData)o;
	   this.temperature=Data.getTemperature();
	   display();
	  
	}
   }
   @Override
   public void display()
   { 
	System.out.println("Display temperature: "+this.temperature);
	
   }
   public int getTemperature()
   {
	return this.temperature;
   }
   
   
}

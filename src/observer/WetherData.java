/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author maxxl
 */
public class WetherData extends Observable
{
   private int temperature;
   private int humidity;
   private int pressure;
   
   public WetherData()
   {
	   
   }
   public void setValue(int temperature,int humidity, int pressure)
   {
   	this.temperature=temperature;
	this.humidity=humidity;
	this.pressure=pressure;
	updateValue();
   }
   private void updateValue()
   {
	setChanged();
	notifyObservers();
   }
   public int getTemperature()
   {
	return temperature;
   }

   public int getHumidity()
   {
	return humidity;
   }

   public int getPressure()
   {
	return pressure;
   }
   
   
   
   
}

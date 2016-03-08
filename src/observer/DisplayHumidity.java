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
public class DisplayHumidity implements Observer, Display
{
   private int humidity;
   public DisplayHumidity(Observable obs)
   {
	   obs.addObserver(this);
   }
   
   
   
   @Override
   public void update(Observable o, Object arg)
   {
	if(o instanceof WetherData)
	{
	this.humidity=((WetherData) o).getHumidity();
	display();
	}
   }
   @Override
   public void display()
   {
	   System.out.println("Display Humidity: "+this.humidity);
   }
   public int getHumidity()
   {
return this.humidity;
   }
   
}

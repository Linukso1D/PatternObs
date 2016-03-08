/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxxl
 */
public class main
{
   
   public static void main(String args[]) throws Exception
   {
   WetherData wetherData = new WetherData();
   DisplayTemperature tablet = new DisplayTemperature(wetherData);
   DisplayHumidity monitor= new DisplayHumidity(wetherData);
wetherData.setValue(2, 4, 6);
wetherData.setValue(6, 2, 6);
wetherData.setValue(2, 3, 1);

Runnable r = ()->System.out.println("DisplayTemperature Runnable"+tablet.getTemperature());
r.run();
Callable <Integer> mValue=()-> monitor.getHumidity();
System.out.println("DisplayHumidity Callable "+mValue.call());
	   
	

   }
   
}

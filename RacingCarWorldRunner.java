//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class RacingCarWorldRunner
{
   public static void main(String[] args)
   {
		System.setProperty("info.gridworld.gui.watermark", "hide");        
       RacingCarWorld test = new RacingCarWorld(new BoundedGrid<Actor>(20,20));
      test.show();
   }
}
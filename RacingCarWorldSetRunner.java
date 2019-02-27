//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class RacingCarWorldSetRunner
{
   public static void main(String[] args)
   {
		System.setProperty("info.gridworld.gui.watermark", "hide");        
       RacingCarWorldSet test = new RacingCarWorldSet(new BoundedGrid<Actor>(20,20));
      test.show();
   }
}
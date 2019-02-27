//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import java.awt.Color;
public class RacingCarRunner
{
   public static void main(String[] args)
   {
        System.setProperty("info.gridworld.gui.watermark", "hide");        
      ActorWorld test = new ActorWorld();
      test.add(new Location(2,3),new RacingCar(Color.RED));
      test.show();
   }
}
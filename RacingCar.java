//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -
import java.awt.event.*;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class RacingCar extends Actor
{
    public RacingCar(Color c)
    {
        setColor(c);
    }

    public void act()
    {
        Location loc = getLocation();
        Grid<Actor> grid = getGrid();
        Location loc1 = loc.getAdjacentLocation(getDirection());
        Location loc2 = loc.getAdjacentLocation(getDirection()+180);
        if(grid.isValid(loc1) && testFor() && grid.get(loc1)==null)
            moveTo(loc1);
        else if(!testFor() && grid.isValid(loc2) && grid.get(loc2)==null)
            moveTo(loc2);
    }

    public boolean testFor()
    {
        Location loc = getLocation();
        Grid<Actor> grid = getGrid();
        if(grid.get(loc.getAdjacentLocation(getDirection())) != null)
            return false;
        else if (grid.get(loc.getAdjacentLocation(getDirection())) instanceof Tire)
            return false;
        else
            return true;
    }
}
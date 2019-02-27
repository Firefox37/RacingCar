//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import java.util.*;
public class RacingCarWorldRandom extends ActorWorld
{
    RacingCar dude,dude1,dude2;
    Grid<Actor> grid;
    public RacingCarWorldRandom(Grid<Actor> grd)
    {
        super(grd);
        grid = getGrid();
        //dudes
        dude = new RacingCar(Color.RED);
        dude1 = new RacingCar(Color.GREEN);
        dude2 = new RacingCar(Color.BLUE);
        //random tires
        for(int i=0;i<100; i++ ){
            int r1 = (int)(Math.random()*20);
            int r2 = (int)(Math.random()*20);
            super.add(new Location(r1,r2),new Tire());
        }
        //tires
        for(int i=0; i<grid.getNumRows(); i++)
            super.add(new Location(i,0),new Tire());
        for(int i=0; i<grid.getNumCols(); i++)
            super.add(new Location(0,i),new Tire());
        for(int i=0; i<grid.getNumRows(); i++)
            super.add(new Location(grid.getNumCols()-1,i),new Tire());
        for(int i=0; i<grid.getNumCols(); i++)
            super.add(new Location(i,grid.getNumRows()-1),new Tire());
        //add dudes
        super.add(new Location(18,9),dude);  dude.setDirection(0);
        super.add(new Location(18,10),dude1); dude1.setDirection(0);
        super.add(new Location(18,11),dude2); dude2.setDirection(0);
        setMessage("Player 1, the RED CAR, uses Arrow Keys; Player 2, the GREEN CAR uses WASD; \n Player 3, the BLUE CAR uses IJKL");
    }

    public boolean keyPressed(String description, Location loc)
    {  
        //dude
        if(description.equals("LEFT") && dude.getGrid().isValid(dude.getLocation().getAdjacentLocation(Location.WEST)))
            dude.setDirection(-90);
        if(description.equals("RIGHT") && dude.getGrid().isValid(dude.getLocation().getAdjacentLocation(Location.EAST)))
            dude.setDirection(90);
        if(description.equals("UP") && dude.getGrid().isValid(dude.getLocation().getAdjacentLocation(Location.NORTH)))
            dude.setDirection(0);
        if(description.equals("DOWN") && dude.getGrid().isValid(dude.getLocation().getAdjacentLocation(Location.SOUTH)))
            dude.setDirection(180);
        //dude1
        if(description.equals("A") && dude1.getGrid().isValid(dude1.getLocation().getAdjacentLocation(Location.WEST)))
            dude1.setDirection(-90);
        if(description.equals("D") && dude1.getGrid().isValid(dude1.getLocation().getAdjacentLocation(Location.EAST)))
            dude1.setDirection(90);
        if(description.equals("W") && dude1.getGrid().isValid(dude1.getLocation().getAdjacentLocation(Location.NORTH)))
            dude1.setDirection(0);
        if(description.equals("S") && dude1.getGrid().isValid(dude1.getLocation().getAdjacentLocation(Location.SOUTH)))
            dude1.setDirection(180);
        //dude2
        if(description.equals("J") && dude2.getGrid().isValid(dude2.getLocation().getAdjacentLocation(Location.WEST)))
            dude2.setDirection(-90);
        if(description.equals("L") && dude2.getGrid().isValid(dude2.getLocation().getAdjacentLocation(Location.EAST)))
            dude2.setDirection(90);
        if(description.equals("I") && dude2.getGrid().isValid(dude2.getLocation().getAdjacentLocation(Location.NORTH)))
            dude2.setDirection(0);
        if(description.equals("K") && dude2.getGrid().isValid(dude2.getLocation().getAdjacentLocation(Location.SOUTH)))
            dude2.setDirection(180);
        return true;
    }
}

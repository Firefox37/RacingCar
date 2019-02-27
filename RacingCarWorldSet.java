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
public class RacingCarWorldSet extends ActorWorld
{
    RacingCar dude,dude1,dude2;
    Grid<Actor> grid;
    public RacingCarWorldSet(Grid<Actor> grd)
    {
        super(grd);
        grid = getGrid();
        //dudes
        dude = new RacingCar(Color.RED);
        dude1 = new RacingCar(Color.GREEN);
        dude2 = new RacingCar(Color.BLUE);
        //tires
        for(int i=0; i<grid.getNumRows(); i++)
            super.add(new Location(i,0),new Tire());
        for(int i=0; i<grid.getNumCols(); i++)
            super.add(new Location(0,i),new Tire());
        for(int i=0; i<grid.getNumRows(); i++)
            super.add(new Location(grid.getNumCols()-1,i),new Tire());
        for(int i=0; i<grid.getNumCols(); i++)
            super.add(new Location(i,grid.getNumRows()-1),new Tire());
        for(int i=3;i<16;i++)
            super.add(new Location(15,i),new Tire());
        for(int i=6;i<19;i++)
            super.add(new Location(12,i),new Tire());
        for(int i=3; i<15; i++)
            super.add(new Location(i,3),new Tire());
        for(int i=4;i<17;i++)
            super.add(new Location(3,i),new Tire());
        for(int i=4; i<10;i++)
            super.add(new Location(i,16),new Tire());
        for(int i=4; i<10;i++)
            super.add(new Location(i,15),new Tire());
        for(int i=6; i<12;i++)
            super.add(new Location(i,6),new Tire());
        for(int i=6; i<12;i++)
            super.add(new Location(i,7),new Tire());
        //add BoxTires
        super.add(new Location(11,8),new BoxTire3(2));
        super.add(new Location(10,9),new BoxTire2(2));
        super.add(new Location(9,10),new BoxTire(2));
        super.add(new Location(8,11),new Tire());
        /**BoxTire box1 = new BoxTire(2); box1.setDirection(90);
        super.add(new Location(7,10),box1);
        BoxTire2 box2 = new BoxTire2(2); box2.setDirection(90);
        super.add(new Location(6,9),box2);
        BoxTire3 box3 = new BoxTire3(2); box3.setDirection(90);
        **///super.add(new Location(5,8),box3);
        BoxTire box4 = new BoxTire(2); box4.setDirection(180);
        super.add(new Location(7,12),box4);
        BoxTire2 box5 = new BoxTire2(2); box5.setDirection(180);
        super.add(new Location(6,13),box5);
        BoxTire3 box6 = new BoxTire3(2); box6.setDirection(180);
        super.add(new Location(5,14),box6);
        /**BoxTire box7 = new BoxTire(2); box7.setDirection(-90);
        super.add(new Location(9,12),box7);
        BoxTire2 box8 = new BoxTire2(2); box8.setDirection(-90);
        super.add(new Location(10,13),box8);
        BoxTire3 box9 = new BoxTire3(2); box9.setDirection(-90);
        **///super.add(new Location(11,14),box9);
        //add dudes
        super.add(new Location(16,10),dude);  dude.setDirection(90);
        super.add(new Location(17,10),dude1); dude1.setDirection(90);
        super.add(new Location(18,11),dude2); dude2.setDirection(90);
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

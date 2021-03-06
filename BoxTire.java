/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;
import java.awt.Color;
/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class BoxTire extends Tire
{
    private int steps;
    private int sideLength;
    private int time;
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public BoxTire(int length)
    {
        steps = 0;
        sideLength = length;
        setColor(Color.ORANGE);
        time =0;
    }

    public void act()
    {
        if(time%2==0)
            act2();
        time++;
    }
    
    /**
     * Moves to the next location of the square.
     */
    public void act2()
    {
        if (steps < sideLength)
        {
            move();
            steps++;
        }
        else
        {
            setDirection(getDirection()+90);
            steps = 0;
            act2();
        }
    }

    public void move()
    {
        moveTo(getLocation().getAdjacentLocation(getDirection()));
    }
}

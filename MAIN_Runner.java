//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
import chn.util.*;
import java.util.Properties;
import java.util.Enumeration;
import info.gridworld.gui.*;
import info.gridworld.world.*;
import javax.swing.JFrame;
public class MAIN_Runner
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        ConsoleIO console = new ConsoleIO();
        char choice;
        String choice2;
        do {
            showMenu();
            choice = console.readLine().charAt(0);
            System.out.println();
            switch (choice) {
                case '1':
                System.setProperty("info.gridworld.gui.watermark", "hide");        
                RacingCarWorldRandom test = new RacingCarWorldRandom(new BoundedGrid<Actor>(20,20));
                test.show();
                break;
                case '2':
                System.setProperty("info.gridworld.gui.watermark", "hide");        
                RacingCarWorldSet test2 = new RacingCarWorldSet(new BoundedGrid<Actor>(20,20));
                test2.show();
                break;
                case '3':
                System.setProperty("info.gridworld.gui.watermark", "hide");        
                RacingCarWorld test3 = new RacingCarWorld(new BoundedGrid<Actor>(20,20));
                test3.show();
                break;
                case '4':
                System.out.println("Be patient! Wait, it it coming soon!");
                break;
                case 'q':
                //getFrame().dispose();
                break;
                default:
                System.out.println("I'm sorry, I did not recognize your choice.");
                break;
            }
        } while (choice != 'q');
    }

    public static void showMenu() {
        String nameOfUserOnThisMachine = System.getProperties().getProperty("user.name");
        System.out.println("\nHello " + nameOfUserOnThisMachine + "!");
        System.out.println();
        System.out.println("1)  Play \"RaNdOm\" mode");
        System.out.println("2)  Play \"Race\" mode");
        System.out.println("3)  Play \"Create Your Own Track\" mode");
        System.out.println("4)  **Coming Soon**");
        System.out.println("q)  Quit?");
        System.out.print("choice: ");
    }

    /**public static JFrame getFrame()
    {
    return frame;
    }**/
}
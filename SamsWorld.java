import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SamsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SamsWorld extends World
{

    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public SamsWorld()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepareScene();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepareScene()
    {
        setPaintOrder(Player.class, Platform.class, Hazards.class, Collectable.class,
            Door.class, Health.class);
            
        // Objects added to scene in starter code
        addObject(new Door(),1174,43); 
        addObject(new Player(),140,757);
    }
   
}

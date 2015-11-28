import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class HomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeScreen extends Screen
{

    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {
        GreenfootImage img = getBackground();
        img.setColor(Color.red);
        img.setFont(new Font("Comic Sans MS Bold", Font.PLAIN, 30));
        img.drawString("Welcome to Krrish Game", 250,320);
        img.drawString("Press 'S' to Start Game",250,370);
        img.drawString("Press 'I' to See Instructions",250, 420);
        
    }
    
    public void act(){
        Screen screen;
        
        if(Greenfoot.isKeyDown("i")){
            screen = new Instructions();
        Greenfoot.setWorld(screen);
    }
}
}

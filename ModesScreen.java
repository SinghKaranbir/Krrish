import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class ModesScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModesScreen extends Screen
{

    /**
     * Constructor for objects of class ModesScreen.
     * 
     */
    public ModesScreen()
    {
        GreenfootImage img = getBackground();
        img.setColor(Color.red);
        img.setFont(new Font("Comic Sans MS Bold", Font.PLAIN, 15));
        img.drawString("Select Modes", 350,100);
        img.drawString(" Press 'e' for easy mode",300,150);
        img.drawString(" Press 'n' for normal mode",300,200);
        img.drawString(" Press 'h' for hard mode",300, 250);
        img.drawString("Press 'b' to go back",300,600);
    }
    
    public void act(){
        Screen screen;
        if(Greenfoot.isKeyDown("e")) {
            setScreen(new GameScreen(1));
        }
        
        if(Greenfoot.isKeyDown("n")) {
            setScreen(new GameScreen(2));
        }
        
        if(Greenfoot.isKeyDown("h")) {
            setScreen(new GameScreen(3));
        } 
        if(Greenfoot.isKeyDown("b")) {
            setScreen(new ChooseNameScreen());
        }
    }
}

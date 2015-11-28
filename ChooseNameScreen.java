import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class ModeAndNameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChooseNameScreen extends Screen
{
    public String userName;
    /**
     * Constructor for objects of class ModeAndNameScreen.
     * 
     */
    public ChooseNameScreen()
    {
       GreenfootImage img = getBackground();
        img.setColor(Color.red);
        img.setFont(new Font("Comic Sans MS Bold", Font.PLAIN, 15));
        img.drawString("Choose Username", 350,100);
        img.drawString("Jagmohan Singh             - a",300,150);
        img.drawString("Jasdeep Singh             -  b",300,200);
        img.drawString("Karanbir Singh            -  c",300, 250);
        img.drawString("Nitesh Wadwa              -  d",300, 300);
        img.drawString("Sumit Rana                -  e",300,350);
        img.drawString("Press 'x' to go back",300,600);
    }
    
    public void act(){
       if(Greenfoot.isKeyDown("a")) userName = "Jagmohan Singh";
       if(Greenfoot.isKeyDown("b")) userName = "Jasdeep Singh";
       if(Greenfoot.isKeyDown("c")) userName = "Karanbir Singh";
       if(Greenfoot.isKeyDown("d")) userName = "Nitesh Wadwa"; 
       if(Greenfoot.isKeyDown("e")) userName = "Sumit Rana";
        if(Greenfoot.isKeyDown("x")) Greenfoot.setWorld(new HomeScreen());
           
       
       
           
    }  
    
}

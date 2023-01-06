import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sulit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sulit extends Actor
{
    /**
     * Act - do whatever the Sulit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sulit()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 120, image.getHeight() - 170);
        setImage(image);
    }
}

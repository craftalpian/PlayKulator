import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mudah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mudah extends Actor
{
    /**
     * Act - do whatever the Mudah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mudah()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 150);
        setImage(image);
    }
}

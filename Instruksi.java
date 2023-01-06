import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruksi extends Actor
{
    /**
     * Act - do whatever the Instruksi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instruksi()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 670, image.getHeight() - 220);
        setImage(image);
    }
}

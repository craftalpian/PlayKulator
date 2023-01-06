import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart1 extends Actor
{
    /**
     * Act - do whatever the Heart1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Heart1()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 50, image.getHeight() + 30);
        setImage(image);
    }
}

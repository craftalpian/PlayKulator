import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart2 extends Actor
{
    /**
     * Act - do whatever the Heart2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Heart2()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 50, image.getHeight() + 30);
        setImage(image);
    }
}

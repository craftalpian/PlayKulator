import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A3 extends Actor
{
    /**
     * Act - do whatever the A3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public A3()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 320, image.getHeight() + 250);
        setImage(image);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C3 extends Actor
{
    /**
     * Act - do whatever the C3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public C3()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 320, image.getHeight() + 250);
        setImage(image);
    }
}

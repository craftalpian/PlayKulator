import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sedang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sedang extends Actor
{
    /**
     * Act - do whatever the Sedang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sedang()
    {
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 110, image.getHeight() - 170);
        setImage(image);
    }
    
    public void act(){
        // Apabila menyentuh tepi layar
        if(isAtEdge()){
            // Menghapus object itu sendiri
            getWorld().removeObject(this);
        }
    }
    
    public void goOut(){
        // Object keluar dari canvas
        move(100);    
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Membuat world dengan ukuran 600x400
        super(600, 400, 1);
        
        GreenfootSound backgroundMusic = new GreenfootSound("F:/ALFIAN/TelkomUniversity/KULIAH/SEMESTER 3/PBO/TUBES/BACKSOUND.wav");
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(30);
        
        // Menambahkan objek mulai di tengah kanvas
        addObject(new Mulai(), 300, 200);
        
        // Menambahkan objek roket
        addObject(new StartRocket(), 300, 400);
        
        // Menambahkan instruksi
        addObject(new Instruksi(), 120, 350);
    }
}

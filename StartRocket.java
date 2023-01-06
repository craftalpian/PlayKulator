import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartRocket extends Actor
{
    /**
     * Act - do whatever the StartRocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public StartRocket(){
        // Mengatur ulang ukuran dari object
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 450);
        setImage(image);
    }
    
    // Text salam
    private Actor textActor = new Actor() {};
    
    // Nyawa
    public int nyawa = 3;
    
    public void act()
    {
        if(isTouching(Mulai.class)){
            // Mempertanyakan nama
            String nama = Greenfoot.ask("Siapa nama Anda?");
            
            // Melepas objek yang sedang bersentuhan
            removeTouching(Mulai.class);
            
            // Membuat sambutan berdasarkan nama
            GreenfootImage text = new GreenfootImage("Halo "+nama+"!\nSilakan pilih menu", 28, Color.BLACK, null);
            textActor.setImage(text);
            getWorld().addObject(textActor, 300, 40);
            
            // Menampilkan level
            getWorld().addObject(new Mudah(), 150, 200);
            getWorld().addObject(new Sedang(), 300, 200);
            getWorld().addObject(new Sulit(), 450, 200);
        }
        
        if(isTouching(Mudah.class)){
            // Melepas objeck yang sedang bersentuhan
            removeTouching(Mudah.class);
            
            // Membuat sambutan berdasarkan nama
            GreenfootImage text = new GreenfootImage("Jawab soal berikut:", 28, Color.BLACK, null);
            textActor.setImage(text);
            getWorld().addObject(textActor, 300, 40);
            
            // Menampilkan nyawa
            Heart(nyawa);
            
            // Menampilkan soal mudah 1
            easy();
        }
        
        if(isTouching(Sedang.class)){
            // Melepas objeck yang sedang bersentuhan
            removeTouching(Sedang.class);
            
            // Membuat sambutan berdasarkan nama
            GreenfootImage text = new GreenfootImage("Jawab soal berikut:", 28, Color.BLACK, null);
            textActor.setImage(text);
            getWorld().addObject(textActor, 300, 40);
            
            // Menampilkan nyawa
            Heart(nyawa);
            
            // Menampilkan soal sedang
            medium();
        }
        
        if(isTouching(Sulit.class)){
            // Melepas objeck yang sedang bersentuhan
            removeTouching(Sulit.class);
            
            // Membuat sambutan berdasarkan nama
            GreenfootImage text = new GreenfootImage("Jawab soal berikut:", 28, Color.BLACK, null);
            textActor.setImage(text);
            getWorld().addObject(textActor, 300, 40);
            
            // Menampilkan nyawa
            Heart(nyawa);
            
            // Menampilkan soal sedang
            hard();
        }
        
        mover();
    }
    
    public void easy(){
        // Menampilkan soal
        getWorld().addObject(new A1(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban
        String jawaban = Greenfoot.ask("Hasil: ");
        
        if(!jawaban.equals("3")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        // Menampilkan soal
        getWorld().addObject(new A2(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban 2
        String jawaban2 = Greenfoot.ask("Hasil: ");
        
        if(!jawaban2.equals("10")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        // Menampilkan soal
        getWorld().addObject(new A3(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban 3
        String jawaban3 = Greenfoot.ask("Hasil: ");
        
        if(!jawaban3.equals("18")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        Result(nyawa);
        Greenfoot.stop();
    }
    
    public void medium(){
        // Menampilkan soal
        getWorld().addObject(new B1(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban
        String jawaban = Greenfoot.ask("Hasil: ");
        
        if(!jawaban.equals("3")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        // Menampilkan soal
        getWorld().addObject(new B2(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban 2
        String jawaban2 = Greenfoot.ask("Hasil: ");
        
        if(!jawaban2.equals("0")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        // Menampilkan soal
        getWorld().addObject(new B3(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban 3
        String jawaban3 = Greenfoot.ask("Hasil: ");
        
        if(!jawaban3.equals("4")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        Result(nyawa);
        Greenfoot.stop();
    }
    
    public void hard(){
        // Menampilkan soal
        getWorld().addObject(new C1(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban
        String jawaban = Greenfoot.ask("Hasil: ");
        
        if(!jawaban.equals("2")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        // Menampilkan soal
        getWorld().addObject(new C2(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban 2
        String jawaban2 = Greenfoot.ask("Hasil: ");
        
        if(!jawaban2.equals("12")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        // Menampilkan soal
        getWorld().addObject(new C3(), 300, 200);
        
        // Mengubah posisi roket
        setLocation(300, 400);
        
        Greenfoot.delay(100);
        
        // Input jawaban 3
        String jawaban3 = Greenfoot.ask("Hasil: ");
        
        if(!jawaban3.equals("0")){
            nyawa -= 1;
            Heart(nyawa);
        }
        
        Result(nyawa);
        Greenfoot.stop();
    }
    
    public void mover(){
        if(Greenfoot.isKeyDown("up")){
            // Merubah lokasi kordinat menjadi Y - 5
            setLocation(getX(), getY()-5);
        }
        
        if(Greenfoot.isKeyDown("down")){
            // Merubah lokasi kordinat menjadi Y + 5
            setLocation(getX(), getY()+5);
        }
        
        if(Greenfoot.isKeyDown("left")){
            // Merubah lokasi kordinat menjadi X - 5
            setLocation(getX()-5, getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
            // Merubah lokasi kordinat menjadi X + 5
            setLocation(getX()+5, getY());
        }
    }
    
    // Hasil akhir
    public void Result(int nyawa){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        if(nyawa == 3){
            getWorld().addObject(a, 300, 200);
        }else if(nyawa == 2){
            getWorld().addObject(b, 300, 200);
        }else if(nyawa == 1){
            getWorld().addObject(c, 300, 200);
        }else{
            getWorld().addObject(d, 300, 200);
        }
    }
    
    // Nyawa permainann
    public void Heart(int nyawa){
        Heart1 nyawa1 = new Heart1();
        Heart2 nyawa2 = new Heart2();
        Heart3 nyawa3 = new Heart3();
        
        if(nyawa == 3){
            getWorld().addObject(nyawa3, 55, 30);
        }else if(nyawa == 2){
            getWorld().addObject(nyawa2, 55, 30);
        }else if(nyawa == 1){
            getWorld().addObject(nyawa1, 55, 30);
        }
    }
}

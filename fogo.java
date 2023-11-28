import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fogo extends Actor
{
    GifImage myGif = new GifImage("ezgif.com-resize (4).gif");
    public int temp=110;
    /**
     * Act - do whatever the fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        moveAtaque();
        acertarAlvo();
    }

    public void moveAtaque(){
        double angle = Math.toRadians( getRotation () );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        setLocation(x, y);
    }
    
    public void acertarAlvo() {
        
        Actor a = getOneIntersectingObject(naruto.class);
        
        if (a != null){
            
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
        
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            temp=0;
         if(temp<1){
            winkakashi world = new winkakashi();
            Greenfoot. setWorld(world);
        }
        }}
}

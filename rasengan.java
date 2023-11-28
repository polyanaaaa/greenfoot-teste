import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rasengan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rasengan extends Actor
{
    
    GifImage myGif = new GifImage("ezgif.com-resize (1).gif");
    public int temp=110;
    /**
     * Act - do whatever the rasengan wants to do. This method is called whenever
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
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        setLocation(x, y);
    }
    
    public void acertarAlvo() {
        Actor a = getOneIntersectingObject(kakashi.class);
        if (a != null){
            
            Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter2.add(10);
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            temp=0;
         if(temp<1){
            winnaruto world = new winnaruto();
            Greenfoot. setWorld(world);
        }

        }
         }
    }



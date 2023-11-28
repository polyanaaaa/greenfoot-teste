import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{

    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 450, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        kakashi kakashi = new kakashi();
        addObject(kakashi,628,337);
        naruto naruto = new naruto();
        addObject(naruto,179,331);
        removeObject(kakashi);
        naruto.setLocation(182,330);
        removeObject(naruto);

        addObject(kakashi,534,312);

        addObject(naruto,192,329);
        kakashi.setLocation(514,371);
        naruto.setLocation(175,357);
        kakashi.setLocation(528,331);
        naruto.setLocation(192,328);
        kakashi.setLocation(522,354);
        naruto.setLocation(170,379);
        naruto.setLocation(188,358);
        Counter counter = new Counter();
        addObject(counter,194,92);
        Counter2 counter2 = new Counter2();
        addObject(counter2,457,88);
        counter.setLocation(168,90);
        counter.setLocation(88,73);
        counter2.setLocation(544,73);
    }
}

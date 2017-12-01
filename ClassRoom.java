import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassRoom extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ClassRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare() 
    {
        Student student1 = new Student(1, "Dalu","Onwuekwe",9 ,84.3,true);
        Student student2 = new Student(2, "John","Taylor",12 ,99.5 ,false);
        Student student3 = new Student(3, "Daniel","Burnell",9 ,78.4 ,false);
        
        addObject( student1,60, 60);
        addObject( student2 ,540 ,60);
        addObject( student3,300, 340);
    }
}

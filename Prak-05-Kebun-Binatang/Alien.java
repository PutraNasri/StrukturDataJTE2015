
/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Komodo implements Tumbuhan
{
    String suara;
    boolean berbuah;
   public String suara(){
       suara="Bip";
       return suara;
       
    }
    public boolean berbuah(){
        berbuah=true;
        return berbuah;
    }
    
    
    
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Alien
     */
    public Alien()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

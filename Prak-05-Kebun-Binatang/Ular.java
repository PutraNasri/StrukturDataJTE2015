
/**
 * Write a description of class Ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular implements Reptilia
{
    
    String suara;
    boolean merayap;
    public String suara(){
    suara="Sss";
    return suara;
    }
    
    public boolean merayap(){
        merayap=true;
        return merayap;
    }
    
    
    
    
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Ular
     */
    public Ular()
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

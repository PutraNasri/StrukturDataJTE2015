import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node
{   
    public Node (BigInteger data){
        this.data=data;
        this.berikut=null;
    }
    public BigInteger data;
    public Node berikut;
}

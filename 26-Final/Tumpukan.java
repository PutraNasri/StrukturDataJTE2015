import java.math.BigInteger;
import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tumpukan
{   
    
    
    public Tumpukan(){
        Node cc = atas;
        while (cc !=null){
            cc=cc.berikut;
        }
        
    }
    
    public void tumpuk(BigInteger data){
        //Node n = new Node(data);
        //n.berikut = atas;
        //bawah=n;
        Node baru = new Node (data);
        baru.berikut = null;
        if(atas == null)
        {
            bawah = baru;
            atas = baru;
        }
        else{
            atas.berikut=baru;
            atas=baru;
        }
    }
    
    public BigInteger ambil(){
        //if (atas == null) {
          //  throw new NoSuchElementException();
        //}
        //return null;
        
        if (atas==null){
        return null;
    }else{
        BigInteger ambil = bawah.data;
        Node sekarang = atas;
        while (sekarang.berikut != null){
            sekarang = sekarang.berikut;
        }
        bawah = sekarang;
         return ambil;
    }
                
    }
    
    public BigInteger atas(){
            if(atas==null)
        return null;
        else {
            return atas.data;
        }
               
    }
    
    public BigInteger bawah(){
      if(bawah!=null)
        return bawah.data;
        else{
            return null;
        }
    }
    
    
    private Node atas;
    private Node bawah;
    private int length = 0;
    private int ukuran;
    
}

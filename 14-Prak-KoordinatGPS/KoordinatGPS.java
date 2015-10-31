import java.lang.Double;

/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
   
   
   public KoordinatGPS(){
       this.bujur= new Double(lintang);
       this.lintang= new Double(bujur);
   }
    
   public KoordinatGPS(double bujur, double lintang){
       this.bujur=bujur;
       this.lintang=lintang;
   }
   
   public KoordinatGPS(Double bujur, Double lintang){
       this.bujur=bujur;
       this.lintang=lintang;
    }
    
    public Double bujur(){
        return bujur;
    }
    
    public Double lintang(){
        return lintang;
    }
    
    private double lintang;
   private double bujur;
}
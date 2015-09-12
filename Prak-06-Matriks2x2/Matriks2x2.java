
/**
 * Write a description of class Matriks2x2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matriks2x2 
{
    
    
    private int a11=4;
    private int a12=1;
    private int a21=2;
    private int a22=3;
    private int b11=5;
    private int b12=6;
    private int b21=8;
    private int b22=5;
 
   public void tambah() {
       
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        Matriks2x2 C = A.tambah(B);
        assertEquals(C.elemen(1,1), a11 + b11);
        assertEquals(C.elemen(2,1), a21 + b21);
        assertEquals(C.elemen(1,2), a12 + b12);
        assertEquals(C.elemen(2,2), a22 + b22);      
        
    }
    public void kurang() {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        Matriks2x2 C = A.kurang(B);       
        assertEquals(C.elemen(1,1), a11 - b11);
        assertEquals(C.elemen(2,1), a21 - b21);
        assertEquals(C.elemen(1,2), a12 - b12);
        assertEquals(C.elemen(2,2), a22 - b22);        
    }
     public void kali() {
        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        Matriks2x2 B = new Matriks2x2(b11, b12, b21, b22);
        Matriks2x2 C = A.kali(B);        
        assertEquals(C.elemen(1,1), a11 * b11 + a12 * b21);
        assertEquals(C.elemen(1,2), a11 * b12 + a12 * b22);
        assertEquals(C.elemen(2,1), a21 * b11 + a22 * b21);
        assertEquals(C.elemen(2,2), a21 * b12 + a22 * b22);
    
    }}
    
  
   
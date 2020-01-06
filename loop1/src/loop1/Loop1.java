
package loop1;
import java.util.Scanner;


public class Loop1 {

   
    public static void main(String[] args) {
     int i, n;
     Scanner Baca = new Scanner(System.in);
     System.out.print("Banyaknya suku =");
     n = Baca.nextInt();
     
     for (i=1; i<n; i=i+2){
         
         System.out.print(i+"Adalah bilangan ganjil");
         System.out.print((i+1)+"Adalah bilangan genap");
     }
     if (n%2 !=0)
         System.out.print(i+"Adalah bilangan ganjil");
     }
      }
      
      
    
    


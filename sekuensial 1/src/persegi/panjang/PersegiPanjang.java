
package persegi.panjang;
import java.util.Scanner;

public class PersegiPanjang {

    public static void main(String[] args) {
       Scanner Baca = new Scanner(System.in);
       int p,l,K,L;
       System.out.print("Panjang =");
       p = Baca.nextInt();
       System.out.print("Lebar =");
       l = Baca.nextInt();
       
       K = 2*(p+l);
       L = p*l;
       
       System.out.println("Keliling =" +K);
       System.out.println("Luas =" +L);
    }
    
}

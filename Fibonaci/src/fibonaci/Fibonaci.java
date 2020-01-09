
package fibonaci;


public class Fibonaci {

        public static int fiboRekursif(int n){
            if (n == 0){
                return 0;
            }
            if (n == 1){
                return 1;
            }
            else{
                return fiboRekursif(n-1) + fiboRekursif(n-2);
            }
        }
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(hasil + " ");
        
    }
    
}
}
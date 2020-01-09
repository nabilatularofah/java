
package faktorial1;


public class Faktorial1 {

    public static int faktorialRekursif(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * faktorialRekursif(n-1);
        }
    }
    public static void main(String[] args) {
       System.out.println("5! =" + faktorialRekursif(5));
                    
    }
    }
            
    


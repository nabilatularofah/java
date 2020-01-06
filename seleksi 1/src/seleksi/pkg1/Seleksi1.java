
package seleksi.pkg1;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;


public class Seleksi1 {

    public static void main(String[] args) {
        int Nilai;
        String grade;
        Scanner Baca = new Scanner(in);
        out.print("Nilai :");
        Nilai = Baca.nextInt();
        
        if (Nilai >= 80){
            grade = "A";
        }
        else if (Nilai >= 66){
            grade = "B";
        }
        else if (Nilai >= 56){
            grade = "C";
        }
        else if (Nilai >= 45){
            grade = "D";
        }
        else {
            grade = "E";
        }
        
        out.print("Grade =" + grade);
        
    }
}
    

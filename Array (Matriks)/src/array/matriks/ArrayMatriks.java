/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.matriks;
import java.util.Scanner;
/**
 *
 * @author hp-ProBook
 */
public class ArrayMatriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row,col;
        int[][] A;
        int[][] B;
        int[][] C;
        Scanner Baca = new Scanner(System.in);
        System.out.print("Ordo baris=");
        row=Baca.nextInt();
        System.out.print("Ordo kolom=");
        col=Baca.nextInt();
        A = new int[row][col];
        B = new int[row][col];
        C = new int[row][col];
        System.out.println("Baca Matriks A =");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("A("+i+","+j+")=");
                A[i][j]=Baca.nextInt();
            }
        }
        System.out.println("\n\nBaca Matriks B =");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("B("+i+","+j+")=");
                B[i][j]=Baca.nextInt();
            }
            
        }
        System.out.println("\nC=A+B");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                
                C[i][j]= A[i][j] + B[i][j];
            }
        }
        System.out.println("\nMatriks A:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                
                System.out.print(A[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println("\nMatriks B:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
            
            System.out.print(B[i][j]+"");
        }
            System.out.println("");
        }
        System.out.println("\nMatriks C:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                
                System.out.print(C[i][j]+"");
            }
          System.out.println("");   
        }
        
    }
   
}

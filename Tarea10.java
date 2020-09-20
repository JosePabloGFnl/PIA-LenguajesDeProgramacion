/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import java.util.Scanner;
public class Tarea10 {
    public static void main (String[] args){
               Scanner lec = new Scanner(System.in);
        int N;
         System.out.print("Ingresa el numero entero: ");
        N = lec.nextInt();
        for (int I=1; I<=N; I++){
          System.out.println(Math.pow(I,((2*I)-1)));  
        }
    
    }//Fin main

}//Fin de la clase
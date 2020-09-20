/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tarea13 {
        public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int N,I;
        int []A;
        int B,cont=0;
        String entrada;
        entrada = JOptionPane.showInputDialog("Ingrese el total de numeros: ");
N = Integer.parseInt(entrada);
A = new int[N];
        for ( I=0; I<N; I++){
       entrada = JOptionPane.showInputDialog("A[" + (I+1) + "]= " );
A[I] = Integer.parseInt(entrada);
        }
        JOptionPane.showInputDialog("Ingrese el número que desee buscar");
            B = Integer.parseInt(entrada);
            
        for(I=0;I<N;I++){
        if(B==A[I]){
            cont++;
        }
        }
 JOptionPane.showMessageDialog(null,"El número "+B+" se encontró "+cont+" veces.");
       String letrero = "A = [ ";
        for(I=0; I < N; I++){
letrero = letrero + A[I] + " ";
        }
        letrero = letrero + "]";
JOptionPane.showMessageDialog(null, letrero);
        
    }//Fin main
}//Fin de la clase

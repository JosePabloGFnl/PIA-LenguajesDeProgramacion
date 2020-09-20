/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import javax.swing.JOptionPane;
public class Tarea12 {
    public static void main (String[] args){
 		String entrada;
		int a=1,b=2,d=-3,n,i=0,k;
		entrada=JOptionPane.showInputDialog("Numeros de la serie: ");
        n=Integer.parseInt(entrada);
        do{
            k=0;
		while(k<a&&i<n){
                    System.out.print(b+", ");
                    b=b+2;
                    k=k+1;
                    i=i+1;
    }
    a=a+1;
    if(i<n){
        for(int j=0;j<3;j++){
            System.out.print(d+", ");
            d=d-2;
            i=i+1;
            if(i>=n){
                break;
                 }
                  }
                   }
                    } while(i<n);
    }//Fin main

}//Fin de la clase


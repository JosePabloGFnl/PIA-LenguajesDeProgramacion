/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import javax.swing.JOptionPane;
public class Tarea11 {
    public static void main (String[] args){
 		String entrada, letrero="";
		int a=1,n,pos=2,neg=-1,x=2,y;
                int i=0;
		entrada=JOptionPane.showInputDialog("Numeros para la serie: ");
        n=Integer.parseInt(entrada);
        
	do{
            y=0;
		while(y<a&&i<n){
                    letrero=letrero+neg+",";
                    neg=neg-2;
                    y=y+1;
                    i=i+1;
                  
    }
    if(i<n){
        for(int j=0;j<x;j++){
            letrero=letrero+pos+",";
            i=i+1;
            if(i>=n){
                break;
                 }
                  }
                pos=pos+2;
                 x=x+1;
                   }
                    } while(i<n);
        JOptionPane.showMessageDialog(null, letrero);
    }//Fin main

}//Fin de la clase

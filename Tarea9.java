/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tarea9 {
    public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int op;
        float x;
        double res;
        String entrada;
        Object[] options={"Dolar","Euro","Yen","Dolar Hong Kong"};
       int v = JOptionPane.showOptionDialog(null,
               "Ingresa la conversión que desee",
               "", 
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,
               options,
               options[0]);
       
        switch (v) {
            case 0:
                entrada = JOptionPane.showInputDialog("Ingrese la cantidad de pesos que desee convertir");
                x = Integer.parseInt(entrada);
                res=(x*0.042);
                JOptionPane.showMessageDialog(null, res+" dólares");
                break;
            case 1:
                entrada = JOptionPane.showInputDialog("Ingrese el número que desee convertir");
                x = Integer.parseInt(entrada);
                res=(x*0.039);
                JOptionPane.showMessageDialog(null, res+" euros");
                break;
            case 2:
                 entrada = JOptionPane.showInputDialog("Ingrese el número que desee convertir");
                x = Integer.parseInt(entrada);
                res=(x*4.47);
                JOptionPane.showMessageDialog(null, res+" yen");
                break;
            case 3:
                 entrada = JOptionPane.showInputDialog("Ingrese el número que desee convertir");
                x = Integer.parseInt(entrada);
                res=(x*0.32);
                JOptionPane.showMessageDialog(null, res+" dólares hongkongeanos");
                break;
            default:
                break;
        }
       

        
    
    }//Fin main

}//Fin de la clase

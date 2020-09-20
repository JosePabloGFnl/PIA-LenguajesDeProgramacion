/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tarea8 {
    public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int op;
        
        double res,x;
        String entrada;
       // JCheckBox check = new JCheckBox("Convertir");
        Object[] options={"°C -> °F ","°F -> °C"};
       int v = JOptionPane.showOptionDialog(null,
               "Ingresa la conversión que desee",
               "", 
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,
               options,
               options[0]);
       
       switch(v) {
           case 0:
                   entrada = JOptionPane.showInputDialog("Ingrese el número que desee convertir");
        x = Double.parseDouble(entrada);
        res=((x*2-x/5) + 32);
        JOptionPane.showMessageDialog(null, res+" grados Farenheit");
        break;
           case 1:
                 entrada = JOptionPane.showInputDialog("Ingrese el número que desee convertir");
        x = Double.parseDouble(entrada);
        res=((x - 32) * 5 / 9);
        JOptionPane.showMessageDialog(null, res+" grados Celsius");
       break;
       }

        
    
    }//Fin main

}//Fin de la clase
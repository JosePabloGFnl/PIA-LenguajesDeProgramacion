/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */

import javax.swing.JOptionPane;

public class Tarea16{
	public static void main (String[]args){
		
		int [][] matriz1;
		int [][] matriz2;
		int [][] multiplicacion;
		int i,j,fil1, col1, fil2, col2;
		int suma = 0;
		String entrada, letrero= "";
		
		do
		{
			entrada=JOptionPane.showInputDialog("Numero de filas de la primera matriz: ");
			fil1 =Integer.parseInt(entrada);
			entrada=JOptionPane.showInputDialog("Numero de columnas de la primera matriz: ");
			col1 =Integer.parseInt(entrada);
			
			matriz1 = new int[fil1][col1];	
			
			entrada=JOptionPane.showInputDialog("Numero de filas de la segunda matriz: ");
			fil2 =Integer.parseInt(entrada);
			entrada=JOptionPane.showInputDialog("Numero de columnas de la segunda matriz: ");
			col2 =Integer.parseInt(entrada);
			
			matriz2 = new int[fil2][col2];	
			
		}
		while( fil1 != fil2 || col1 != col2);
		
		
		
		for(i=0; i<fil1 ; i++)
		{
			for(j=0; j<col1 ; j++)
			{
				entrada = JOptionPane.showInputDialog(null,"Ingresa el valor de la primera matriz " + "[" + (i+1) + "][" + (j+1) + "] : " );
				matriz1[i][j]=Integer.parseInt(entrada);
			}
		}	

		for(i=0; i<fil2 ; i++)
		{
			for(j=0; j<col2 ; j++)
			{
				entrada = JOptionPane.showInputDialog(null,"Ingresa el valor de la segunda matriz " + "[" + (i+1) + "][" + (j+1) + "] : " );
				matriz2[i][j]=Integer.parseInt(entrada);
			}
		}			
					
		multiplicacion = new int[fil1][col1];
		JOptionPane.showMessageDialog(null, "Matriz A * B es: \n");
			
		for(i = 0; i < fil1; i++){
			for(j = 0; j < col1; j++){
				suma = 0;
				for(int k = 0; k < col1; k++){
					suma += matriz1[i][k] * matriz2[k][j];
				}
				multiplicacion[i][j] = suma;
				letrero = letrero + multiplicacion[i][j] + " ";
			}
		letrero = letrero + "\n";
		}
		
		JOptionPane.showMessageDialog(null,letrero);					

	} // Fin de metodo main
}// Fin de clase

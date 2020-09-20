/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V5
 */
import javax.swing.JOptionPane;
public class Tarea14 {
    public static void main (String[] args){
int [][] matriz;
		int i,j,fil, col, buscar, cont=0;
		String entrada, letrero= " ";
		
		entrada=JOptionPane.showInputDialog("Numero de filas: ");
		fil =Integer.parseInt(entrada);
		entrada=JOptionPane.showInputDialog("Numero de columnas: ");
		col =Integer.parseInt(entrada);
		
		matriz = new int[fil][col];		
		
		for(i=0; i<fil ; i++)
		{
			for(j=0; j<col ; j++)
			{
				entrada = JOptionPane.showInputDialog(null,"Ingresa el valor de la matriz " + "[" + (i+1) + "][" + (j+1) + "] : " );
				matriz[i][j]=Integer.parseInt(entrada);
			}
		}			
		
		entrada=JOptionPane.showInputDialog("Ingresa el Numero a Buscar");
		buscar = Integer.parseInt(entrada);	
		
		for(i=0; i<fil ; i++)
		{
			for(j=0; j<col ; j++)
			{
				if(matriz[i][j]== buscar)
				{
						cont++;
				}
			}
		}
		
		if(cont==1)
		{
			JOptionPane.showMessageDialog(null, "El numero que busco aparece  " + cont + "  vez en la matriz \n\n");
		}
		else if (cont > 1)
		{
			JOptionPane.showMessageDialog(null, "El numero que busco aparece  " + cont + "  veces en la matriz \n\n");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "El numero que busco NO se encuentra en la matriz \n\n");
		}
		
		letrero = letrero + "Matriz: \n";
		for(i=0;i < fil ; i++){
			for(j=0;j < col ; j++){					
					letrero = letrero + matriz[i][j] + " ";                  
			}
			letrero= letrero + "\n";
		}		
		
		JOptionPane.showMessageDialog(null,letrero);
    
}
}

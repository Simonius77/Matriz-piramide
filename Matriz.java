

/** matriz donde i son las filas y j las columnas**/


public class Matriz{
	public static void main (String [] args){
/** Bucle for que genera una columna por cada fila que recorre**/
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
			System.out.print("*");
			}
			/** Salto de linea para imprimir la piramide**/
			System.out.println();
		}
	}
}	
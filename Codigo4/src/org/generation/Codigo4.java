/** ¡Vamos a jugar!
 * Basándose en las reglas, este programa permite jugar "piedra, papel o tijeras" 
 * entre dos jugadores e imprime en la consola al ganador del juego. 
 * 
 * Lee la entrada de cada usuario y almacena ese valor en una variable
 * y realiza las comparaciones pertinentes para determinar al ganador,
 * ademas tambien imprime "empate" en caso de que se llegue a uno.
 */

package org.generation;
import java.util.Scanner; // Se debe de importar el scanner para poder leer la entrada de los datos desde el teclado

public class Codigo4 {

	public static void main(String[] args) { // Se agrega para la correcta ejecucion del programa
		    Scanner s = new Scanner(System.in); // Se agrega System.in entre parentesis para indicar que se va a leer la entrada desde la consola
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine(); 
		    
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Cambiar jugador 1 por jugador 2
		    //Scanner s2 = new Scanner(); // Parte no es necesaria
		    String j2 = s.nextLine(); // Cambiar s2 por j2, para saber que se hace referncia al jugador 2
		    
		    //if (j1 == j2)) { // eliminar, no se usa operador de igualdad, sino .equals(), porque se comparan strings
		    if (j1.equals(j2)) {
		      System.out.println("Empate");
		    } else {
		      int g = 2;
		      switch(j1) {
		        case "piedra":
		          //if (j2 == "tijeras") { // no se usa operador de igualdad, sino .equals(), porque se comparan strings
		          if (j2.equals("tijeras")) {
		            g = 1;
		          }
		          break; // Agregar break 
		          
		        case "papel":
		          if (j2.equals("piedra")) { // no se usa operador de igualdad, sino .equals(), porque se comparan strings
		            g = 1;
		          } // agregar { 
		          break; // Agregar break  
		          
		          
		        case "tijeras": // Le faltaba una "s" a tijeras
		          if (j2.equals("papel")) { // no se usa operador de igualdad, sino .equals(), porque se comparan strings
		            g = 1;
		          }
		          
		          break;
		        default:
		      }
		      System.out.println("Gana el jugador " + g);
		  }

	}
}

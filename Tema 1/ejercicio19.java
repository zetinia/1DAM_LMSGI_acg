/*Escribe un programa en Java que:

Pida al usuario un número positivo N.

Use un bucle while para recorrer todos los números del 1 al N.

Para cada número, muestre si es par o impar.
 * 
 * 
 * 
 */



public class ejercicio19 {
    public static void main(String[] args) {
          int i = 1;
        int numeroPositivo = Integer.parseInt(System.console().readLine("Introduzca un numero"));

        
           
        while (i <= numeroPositivo) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
            i++;
        }
        

    }
}

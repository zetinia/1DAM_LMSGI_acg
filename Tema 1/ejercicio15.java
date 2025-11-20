/*Escribe un programa en Java que:

Pida al usuario un número N.

Use un bucle for para imprimir todos los números pares desde 1 hasta N.

Al final, muestra cuántos números pares se imprimieron.
 * 
 * 
 * 
 * 
 */




public class ejercicio15 {

    public static void main(String[] args) {
        
        
        int numero = Integer.parseInt(System.console().readLine("Introduzca numero a desear:"));
        int numerosPares = 0;
        for (int i = 1; i < numero; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                numerosPares++;
            }


        


        

        }
    }
}
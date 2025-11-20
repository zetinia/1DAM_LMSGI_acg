/*Escribe un programa en Java que:

Pida al usuario un número entero positivo.

Use un bucle while para imprimir su tabla de multiplicar del 1 al 10.
 * 
 * 
 * 
 * 
 */




public class ejercicio17 {
    public static void main(String[] args) {
        

        int numero = Integer.parseInt(System.console().readLine("Introduzca un numero entero:"));

         int i = 1;

        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}

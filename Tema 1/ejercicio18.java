/*Escribe un programa en Java que:

Pida al usuario que introduzca números uno por uno.

El programa seguirá pidiendo números mientras el usuario no introduzca un número negativo.

Cuando el usuario introduzca un número negativo, el programa debe terminar y mostrar la cantidad total de números positivos ingresados. */



public class ejercicio18 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un numero:"));
        int i = 0;
        while (numero > 0) {
            i++;
            numero = Integer.parseInt(System.console().readLine("Introduzca un numero:"));
            
            
                
                
            
            
        }
       System.out.println( i  +  "numeros han salido positivos");
    }
}

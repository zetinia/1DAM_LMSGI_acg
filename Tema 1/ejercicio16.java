/*Pida al usuario un número entero N mayor que 0.

Use un bucle while para calcular la suma de todos los números desde 1 hasta N.

Al final, muestre el resultado. */



public class ejercicio16 {
    public static void main(String[] args) {
        
        int suma = 0;
        int i = 1;
        int numeroEntero = Integer.parseInt(System.console().readLine("Introduzca un numero:"));

        while (i<=numeroEntero) {
            suma += i;
            i++;

        }
        System.out.println(suma);
        
            }
           
        }
    


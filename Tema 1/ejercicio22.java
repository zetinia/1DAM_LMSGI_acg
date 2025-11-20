/*Un teatro tiene 10 filas de asientos con 10 asientos cada una. Al abrir el teatro antes
de la función, el trabajador que está en la taquilla inicia el programa (y, lógicamente,
aparecen todos los sitios disponibles... lo cual vamos a representar con ceros).
Cuando llegan los primeros clientes, el trabajador pregunta todas estas cuestiones:
¿Cuántos sois?
¿En qué fila queréis sentaros?
¿Cuál queréis que sea el asiento del primero de vosotros?
En función de la respuesta, el programa dibujará con un número 1 sobre la matriz los
sitios que se van a ocupar (si es posible), y volverá a preguntar a los siguientes.
El programa debe comprobar siempre:
- Si los datos introducidos son correctos (por ejemplo, si el teatro tiene filas de la 0 a
la 9, el usuario no puede decir que quiere sentarse en la fila 14).
- Si los sitios están disponibles.
Si no se cumple alguna de estas condiciones, el programa se lo indica al usuario y
vuelve a preguntar.
El programa solo finalizaría si todos los asientos del teatro estuviesen ocupados.
Mientras quede al menos uno libre, el programa seguirá preguntando.


 * 
 * 
 * 
 * 
 */




public class ejercicio22 {
    public static void main(String[] args) {
        
String asiento = "0";
int [][] butacas = new int[10][10];

int cantidad = Integer.parseInt(System.console().readLine("¿Cuantos sois?"));
int fila = Integer.parseInt(System.console().readLine("¿En que fila os quereis sentar?"));

if (cantidad < 1 || cantidad > 10){
    System.out.println("cantidad invalida");
    

}
    


;

    }
}

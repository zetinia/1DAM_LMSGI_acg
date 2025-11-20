/*Escribe un programa en Java que:

Pida al usuario una contraseña.

Use un bucle do…while para seguir pidiéndola mientras la contraseña introducida no sea “1234”.

Cuando el usuario introduce “1234”, el programa debe mostrar:
"Acceso concedido."
 * 
 * 
 * 
 * 
 */


public class ejercicio20 {
    public static void main(String[] args) {
        int contrasena = Integer.parseInt(System.console().readLine("Introduzca contraseña"));
       do {
            contrasena = Integer.parseInt(System.console().readLine("Introduzca contraseña"));
       } while ( contrasena != 1234); 
       System.out.println("Acceso concedido");
    }
}

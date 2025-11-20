/*Haz un programa que pregunte al usuario cuanto dinero tiene en el banco. Despues, el programa
 debe preguntar cuanto quiere gastarse hoy y guardarlo. Despues, el programa debe preguntar cuanto
 desea ingresar hoy y guardarlo. Por ultimo, muestra el dinero final en la cuenta (tras el gasto y el ingreso)
 * 
 * 
 * 
 * 
 * 
 */



public class ejercicio1 {
    public static void main(String[] args) {
        float dineroTotal = 0f;
        float dineroGastadoTotal = 0f;
        float dineroIngresado = 0f;


         dineroTotal = Float.parseFloat(System.console().readLine("¿Cuanto dinero dispone en el banco?"));

        float dineroGastado = Float.parseFloat(System.console().readLine("¿Cuanto vas a gastar hoy?"));

         dineroIngresado = Float.parseFloat(System.console().readLine("¿Cuanto dinero vas a ingresar?"));

        dineroTotal  = dineroTotal - dineroGastado + dineroIngresado;

       System.out.println("Tienes en total " + dineroTotal);

    }
}

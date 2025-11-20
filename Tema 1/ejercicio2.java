/*Programa que pregunta cuantos trozos tiene una tarta, cuantas personas van a comer, y muestra
 cuantos trozos tocan por persona y cuantos sobran.
 * 
 * 
 * 
 * 
 */



public class ejercicio2 {
    public static void main(String[] args) {
        
        int trozosTarta = Integer.parseInt(System.console().readLine("¿Cuantos trozos tiene la tarta"));

        int trozosPersonas = Integer.parseInt(System.console().readLine("¿Cuantas personas van a comer"));


        int trozosPorPersona = trozosTarta / trozosPersonas;

        int trozosSobrantes = trozosTarta % trozosPersonas;


        System.out.println("Trozos por persona " + trozosPorPersona);
        System.out.println("Trozos sobrantes " + trozosSobrantes);


        

    }
}

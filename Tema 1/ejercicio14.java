/*Crea un programa que genere un numero aleatorio entre 1 y 100 y pida al usuario
que lo adivine. El programa debe seguir preguntando una y otra vez hasta que el 
usuario realmente lo acierte (sin numero maximo de intentos). Tras cada pregunta,
ira diciendo si el numero buscado es mayor o menor que el introducido, para dar
pistas al usuario.
 */

public class ejercicio14 {
    public static void main(String[] args) {

        int adivina = Integer.parseInt(System.console().readLine("Introduce numero a adivinar"));

        double aleatorio = (int) Math.random() * 100 + 1;

        while (aleatorio != adivina) {
         adivina = Integer.parseInt(System.console().readLine("Introduce numero a adivinar"));
            if (adivina < aleatorio) {
                System.out.println("Busca uno más grande");
            } else if (adivina > aleatorio) {
                System.out.println("Busca uno más pequeño");

            } else
                System.out.println("Has acertado");

        }

    }
}

/*Escribe un programa que te pregunte la nota que has 
 
sacado en una asignatura y te diga si corresponde a
un insuficiente, suficiente, bien, notable o sobresaliente
0-4: suspenso
5-6: suficiente
6-7: bien
7-9: notable
10: sobresaliente*/



public class Ejercicio5 {
    public static void main(String[] args) {
        
        int nota = Integer.parseInt(System.console().readLine("Introduce una nota:"));
        if (nota >= 0 && nota <= 5){
            System.out.println("Tienes un insuficiente");
        }
        else if (nota >= 5 && nota <= 6){
            System.out.println("Tienes un suficiente");
        }
        else if (nota >= 6 && nota <= 7){
            System.out.println("Tienes un bien");
        }

        else if (nota >= 7 && nota <= 9){
            System.out.println("Tienes un notable");
        }

        else if ( nota == 10){
            System.out.println("Tienes un sobresaliente");
        }

    }
}

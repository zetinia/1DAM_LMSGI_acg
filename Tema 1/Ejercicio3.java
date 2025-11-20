/*
 Realiza un programa para la entrada de una discoteca, que pregunte la edad e imprima por pantalla si puedes
 entrar o no en función 
 */



public class Ejercicio3 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(System.console().readLine("¿Cuantos años tienes?"));
        
        
        if (edad >= 18) {

            System.out.println("Puedes pasar rey");
            
        }
        else{
            System.out.println("No puedes pasar villano");
        }
    }
}

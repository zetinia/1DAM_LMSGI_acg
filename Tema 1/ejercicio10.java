/*//*Desarrolla un programa que pregunte un saludo al usuario y le pregunte cuantas
 
veces quiere repetirlo. El programa repertira el saludo tantas veces como el
usuario haya indicado.*/ 



public class ejercicio10 {
    public static void main(String[] args) {
        String hola = System.console().readLine("¿Cual es tu saludo?:");
        int saludo = Integer.parseInt(System.console().readLine("¿Cuantas veces quieres saludar?:"));
        for (int i = 0; i < saludo ; i++) {
            System.out.println(hola);
        }
    }
}

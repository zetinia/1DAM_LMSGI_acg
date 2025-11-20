/*Desarrolla un programa que pregunte al usuario un numero y muestre
 
por consola la tabla de multiplicar de ese numero (simplifica
tu codigo usando un bucle) */





public class ejercicio8 {
    public static void main(String[] args) {
        
        int multiplo = Integer.parseInt(System.console().readLine("Introduce un numero:"));


        for (int i = 0; i < 11 ; i++) {
            
            System.out.println(multiplo + "x" + i + "=" + multiplo * i);
        }
    }
}

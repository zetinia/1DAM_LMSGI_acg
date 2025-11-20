/*Desarrolla un programa que te preguna una frase y te la repite. El
    
programa va a repetir tu frase 100 veces, excepto que una de las veces
escribas la palabra "stop", en cuyo caso finalizara el programa*/



public class ejercicio11 {
    public static void main(String[] args) {
        

        String frase = "";
        

        for (int i = 0; i < 101; i++) {

            frase = System.console().readLine("Introduzca frase:");
         
            if (frase.equals("stop")){
                break;

                
            }
            else System.out.println(frase);
            
        }

    }
}

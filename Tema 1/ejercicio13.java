/*Un bucle pretende imprimir todos los numeros del 0 al 100,
 pero se interrumpe en el numero que le diga el usuario 
 -Dime un numero: 8*/


public class ejercicio13 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Dime un numero:"));

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
                if(numero == i){
                    break;
                }
            }
            
        }
           }
          ;
            
        
    

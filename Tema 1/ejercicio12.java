/**Programa que te pide una contraseña y te dice si has acertado. Tienes 3 intentos.
 
Si te equivocas pasa al segundo intento y si finalizas los intentos se acaba el
programa. Si aciertas, te dice que has acertado y ya no te pregunta mas.*/ 



public class ejercicio12 {
    public static void main(String[] args) {
        

String contrasenos = "";


for (int i = 0; i < 3; i++) {

   contrasenos = System.console().readLine("Introduce contraseña:");
        if (contrasenos.equals("hola")) {
            System.out.println("hAS ACERTADO");
            break;
            
        }
        else if (contrasenos.equalsIgnoreCase("hola")){

        System.out.println("Intentalo de nuevo");
    }
    }
    
    
}

    }


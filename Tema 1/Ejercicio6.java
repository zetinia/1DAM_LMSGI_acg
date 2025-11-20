/*El programa pide ancho y alto de la bandera en cm. 
 
(Se cobra a 2 cents el cm2)
Se pregunta si se desea escudo bordado (2.5€) y si
se envia o se recoge (envio 5€).
Se muestra el precio total.*/




public class Ejercicio6 {
    public static void main(String[] args) {
        
        float ancho = Float.parseFloat(System.console().readLine("Introduce ancho de bandera:"));
        float alto = Integer.parseInt(System.console().readLine("Introduce alto de bandera:"));

        int bandera;
        float anchoPrecio = ancho * 0.02f;

        float anchoLargo = alto * 0.02f;

        String escudo = System.console().readLine("¿Desea escudo bordado:?");
        String envio = System.console().readLine("¿Desea envio?:");

        if (escudo.equals("si")){

        
        }
        else if (envio.equals("si")){
            
        }

        System.out.println("Precio total final :" + anchoPrecio + anchoLargo + escudo + envio );

        

    }
}

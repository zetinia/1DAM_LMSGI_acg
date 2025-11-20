/*
 Realiza un programa que pida una hora por teclado y que muestre "buenos dias", "buenas tardes" o 
 "buenas noches" segun la hora. Se utilizaran los tramos:

 
De 6 a 12 (buenos dias)
De 13 a 20 (buenas tardes)
De 21 a 5 (buenas noches)

 Solo se tienen en cuenta las horas no los minutos
 */




public class Ejercicio4 {
    public static void main(String[] args) {
       
        int hora = Integer.parseInt(System.console().readLine("Introduzca una hora:"));



        if(hora >= 6 && hora <= 12 ){
            System.out.println("Buenos dias");
        }
        else if (hora >= 13 && hora <=20 ){
            System.out.println("Buenas tardes");
        }
        else if (hora >= 21 && hora <= 23 || hora >= 0 && hora <=5 ){
            System.out.println("Buenas noches");
        }





    }
}

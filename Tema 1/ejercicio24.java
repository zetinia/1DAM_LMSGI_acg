/*
 Basandote en los ejercicios anteriores de este bloque, crea una matriz de 5x4 rellena de números
 aleatorios (0 - 99). Recorre la matriz para encontrar cual es el numero mas grande de todos los
 que se han generado y muestralo. Muestra tambien en que posición (fila y columna) se encuentra.
 */



public class ejercicio24 {
    public static void main(String[] args) {
       
        
        int [][] array = new int [5][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
              
                int fila = (int) (Math.random()*100);
        int columna = (int) (Math.random()*100);

        System.out.println(array[fila][columna]);
            }
        }

        ç
        

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
        }
        System.out.print("");

    }
}

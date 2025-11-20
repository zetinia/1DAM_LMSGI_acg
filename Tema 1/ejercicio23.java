/*
 Crea un array bidimensional de 8 filas y de 6 columnas relleno al completo de ceros. Haz que 
 en una posicion aleatorio del array se coloque un 1. Muestra la matriz por consola
 */




public class ejercicio23 {
    public static void main(String[] args) {
   

        

        // CREAR ARRAY
        int[][] array = new int[8][6];

        // DOBLE BUCLE PINTAR 0
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        }

        int fila = (int) (Math.random() * 8);
        int columna = (int) (Math.random() * 6);
        array[fila][columna] = 1;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}


 
/*/*
 Buscar un número. Crea una matriz de 30 x 30 con números aleatorios (0-100). Pide al
 usuario un número para buscar. Recorre la matriz y, si encuentras el número, muestra
 un mensaje indicando la fila y columna donde está. Si el nùmero no se encuentra, informalo
 también.
 */




public class ejercicio25 {
    public static void main(String[] args) {
        int [][] array = new int[30][30];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array [i][j] = (int) (Math.random()*101);

                 int buscarNumero = Integer.parseInt(System.console().readLine("busca un numero:"));
               if(   array [i][j] == buscarNumero){ 
                 System.out.println("Esta en la fila " +  i  +  " y en la columna " + j  ) 
                };
            }


        }
        
    }
}

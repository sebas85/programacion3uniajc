public class EjemploMatrices {
    public static void main(String[] args) {
        /*/ 
        // Declaración de una matriz de 3x3
        int[][] m = { { 9, 3, 5 },
                      { 1, 4, 2 },
                      { 8, 7, 6 } };

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("m[" + i + "][" + j + "]=" + m[i][j]);
            }

        }
        */ 

        /*/
        //EJERCICIO 17
    
        int [][] s = { { 1, 4, 2 },
                       { 9, 3, 5 },
                       { 8, 6, 7 } };


        int[] sFilas = new int[s.length];        // Array para guardar la suma de cada fila   
        int[] sColumnas = new int[s[0].length];  // Array para guardar la suma de cada columna 
        
        // Recorremos la matriz para calcular las sumas de filas y columnas
        for(int i = 0; i < s.length; i++){   
            for(int j = 0; j < s[0].length ;j++){

                sFilas[i] += s[i][j];     // Sumamos el elemento actual a la suma de la fila correspondiente
                sColumnas[j] += s[i][j];  // Sumamos el elemento actual a la suma de la columna correspondiente
            }
       
        }
   
        for(int i = 0; i < sFilas.length; i++){
            System.out.println("Suma de filas");
            System.out.println("Fila " + (i + 1) + " Suma = "+ sFilas[i]); 

        }
     
        for(int j = 0; j < sColumnas.length; j++){
            System.out.println("Suma de columnas");
            System.out.println("Columna "+( j + 1)+ " Suma = " + sColumnas[j]);
        }
        */


        //EJERCICIO 18
         

        int[][] tMultiplicar= new int [10][10];         // Crea una matriz de 10x10 para almacenar la tabla de multiplicar 

        for(int i = 0; i < 10; i++){                     // Bucle para recorrer las filas 
            for(int j = 0; j < 10; j++){                 // Bucle para recorrer las columnas
                tMultiplicar[i][j] = (i + 1) * (j + 1);  // Cálculo y almacenamiento
            }
        }

        System.out.println("Tabla de Multiplicar del 1 al 10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tMultiplicar[i][j]); // Formato con espacios, Impresión formateada.
                                                                              //Esto asegura que los números estén alineados en columnas.
            }
            System.out.println(); // Nueva línea para para separar cada fila
        }








    }

}      



/*/
         int num = 5;
         System.out.println("Tabla de multiplicar del " +num);
         for(int i = 0; i < 10; i++){
            int mult;
            mult = num * (i+1);
            
            System.out.println((i+1) + " x " + num + " = " + mult);
         }

         */

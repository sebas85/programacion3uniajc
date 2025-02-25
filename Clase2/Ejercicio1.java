package Clase2;

import java.util.Arrays;
import java.util.Scanner;

import Clase3.MetodosArreglos;

public class Ejercicio1 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            OperacionesConArreglos op = new OperacionesConArreglos();


           /* // Crear un arreglo de enteros
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
            
            // Mostrar los elementos del arreglo
           System.out.println(op.mostrarElementos(a));
           System.out.println("La suma de los elementos del arreglo es: " + op.sumarElementos(a));
           System.out.println("El promedio de los elementos del arreglo es: " + op.promedioElementos(a));
            
           */
            

           /*
           int n = 5;
           int[] a = op.llenaArregloAleatorio(n);
           System.out.println(op.mostrarElementos(a));
       
           int min = -10;
           int max = 20;
           int randomNum = min + (int)(Math.random() * ((max - min) + 1));
           System.out.println("Número aleatorio generado entre " + min + " y " + max + ": " + randomNum);

            */
          


            /*/EJERCICIO 1

            System.out.print("Por favor digite el tamano del arreglo "); 
            int n = sc.nextInt();    //Crea el arreglo de acuerdo al numero 
            int [] numeros = op.llenaArregloAleatorio(n); //llena el arreglo de forma aleatoria
    
            System.out.println(op.mostrarElementos(numeros)); // muestra los elementos que se llenaron de forma aleatoria
            System.out.println("La suma de los elementos es igual a: "+ op.sumaElementos(numeros)); //suma los elementos mostrados anteriormente

            */

            /*/EJERCICIO 2

            System.out.print("Ingrese el número de empleados: ");
            int n = sc.nextInt();

            op.NetoAPagarEmpleado(n);
           
            */



            /*/EJERCICIO 3
        
            System.out.print("Ingrese Numero del arreglo: "); 
            int n = sc.nextInt();

            int [] numeros = op.llenaArregloAleatorio(n);
            
            System.out.println(op.mostrarElementos(numeros)); // muestra los elementos que se llenaron de forma aleatoria
            
            System.out.println("Suma de números pares: " + op.sumaPares(numeros));
            System.out.println("Suma de números impares: " + op.sumaImpares(numeros));
    
            */


             /*/EJERCICIO 4       
            System.out.print("Digite Numero de personas del grupo 1:");
            int e1= sc.nextInt();
        
            System.out.print("Digite Numero de personas del grupo 2:");
            int e2= sc.nextInt();
  
            //Arreglo para guardal los las edades
            int[] edades1 = new int[e1];
            int[] edades2 = new int[e2];

            System.out.println(op.mostrarElementos(edades1));
            System.out.println(op.mostrarElementos(edades2));
        

            // Llenar el primer arreglo
            System.out.println("Ingrese las edades del primer grupo:");
            for (int i = 0; i < e1; i++) {
                System.out.print("Edad " + (i + 1) + ": ");
                edades1[i] = sc.nextInt();
            }


            // Llenar el segundo arreglo
            System.out.println("Ingrese las edades del segundo grupo:");
            for (int i = 0; i < e2; i++) {
                System.out.print("Edad " + (i + 1) + ": ");
                edades2[i] = sc.nextInt();
            }

            int mayorEdad = op.encontrarMayor(edades1, edades2);
            System.out.println("La mayor edad es: " + mayorEdad);
        }
     
        */
        
        /*/EJERCICIO 5
        
        System.out.print("Digite la Cantidad de productos:");23
        int n1= sc.nextInt();
        sc.nextLine();
        
        op.productoMayorGasto(n1);
        */
    
        /*/EJERCICIO 6

        System.out.print("Número de Vivendas: ");
        int n= sc.nextInt();
        
       op.gananciasVivienda(n);

        */


       /*/EJERCICIO 7


       int[] a = new int[10]; // Arreglo original de 10 elementos

       // Entrada de datos
       System.out.println("Ingrese 10 números:");
       for (int i = 0; i < 10; i++) {
           System.out.print("Número " + (i + 1) + ": ");
           a[i] = sc.nextInt();

        }

        op.areglosParesImpares(a);
        */


        /*/Ejercicio 8

        int[] n = new int[30]; // Arreglo de 30 números

        // Entrada de datos
        System.out.println("Ingrese 30 números enteros:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        // Encontrar el mayor y el menor
        int mayor = op.encontrarMayor(n);
        int menor = op.encontrarMenor(n);

        // Contar repeticiones
        int repeticionesMayor = op.contarRepeticiones(n, mayor);
        int repeticionesMenor = op.contarRepeticiones(n, menor);


        System.out.println("\n----- Resultados -----");
        System.out.println("Número mayor: " + mayor + " (se repite " + repeticionesMayor + " veces)");
        System.out.println("Número menor: " + menor + " (se repite " + repeticionesMenor + " veces)");
        
        */
         
        
        /*/ Ejercico 9
        // Solicitar tamaño del arreglo
        System.out.print("Ingrese la cantidad de números en el arreglo: ");
         int n = sc.nextInt();

        int[] arreglo = new int[n]; // Crear arreglo del tamaño indicado

        // Entrada de datos
        System.out.println("Ingrese los números del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        // Solicitar número a buscar
        System.out.print("\nIngrese el número a buscar en el arreglo: ");
        int numeroBuscado = sc.nextInt();
 
        int aparece = op.vecesNumero(arreglo, numeroBuscado);

        System.out.println("\n----- Resultados -----");
        System.out.println("El número " + numeroBuscado + " aparece " + aparece + " veces.");
        
        */

        /*/ Ejercico 10
        System.out.print("Ingrese Tamano del arreglo: ");
        int n = sc.nextInt();

        int[] a = new int[n]; // Crear el arreglo A

        // Entrada de datos
        System.out.println("Ingrese los numeros del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Llamamos al método que genera el nuevo arreglo B
         
        int[] B = op.sumarOpuestos(a);

         // Mostrar resultados
         System.out.println("\n----- Resultados -----");
         System.out.println("Arreglo original A: " + Arrays.toString(a));  //Convierte un arreglo (array) llamado B en una representación de cadena (String). 
         System.out.println("Arreglo resultante B: " + Arrays.toString(B));
        */


        
        /*/ Ejercico 11

        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();
        
        int[] A = new int[n];
    
        System.out.println("Ingrese los números del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = sc.nextInt();
    
        }

        // Llamamos al método que separa los elementos
        int[][] resultado = op.separarNumeros(A);

        // Mostrar resultados
        System.out.println("\n----- Resultados -----");
        System.out.println("Arreglo original A: " + Arrays.toString(A));
        System.out.println("Negativos: " + Arrays.toString(resultado[0]));
        System.out.println("Ceros: " + Arrays.toString(resultado[1]));
        System.out.println("Positivos: " + Arrays.toString(resultado[2]));
 
       */

       
        //ejercicio15
          // Crear el objeto para acceder a la clase MetodosArreglos
            MetodosArreglos obj = new MetodosArreglos();

        String[] nombres = { "Alan", "Devora", "Miguel", "Sandra", "Diego" };
        int[] sueldos = { 100, 200, 150, 300, 100 };

        System.out.println(obj.nombresSueldos(nombres, sueldos));


        /*/ Ejercicio 12: Encontrar las pocisiobes de un numero en un arreglo
    
    
            int[]arreglo = { 4,6,8,2,6,9,6,1};
            int numeroBuscado=6; // El numero que vamos a buscarm
            System.out.print("Posiciones: ");
            for(int i=0;)i< arreglo.length; i++){
                if(arreglo[i]==numeroBuscado){
                    System.out.print((i+1)+"");
                }
            }
            */
    
            
        /*/Ejercicio 13: Separar numeros mayores y menores que la media de un arreglo
    
        int[]arreglo= {5,8,12,3,7,10};
        double media=0;
        for(int numero : arreglo){
            media += numero;
        }
        media /= arreglo.length;// Calculamos la media dividiendo la suma por la cantidad de elementos
        System.out.println("Media: "+ media);
        System.out.print("Mayores que la media: ");
        for(int numero: arreglo){
            if(numero>media){
                System.out.print(numero+"");
            }
        }
        System.out.print("\nMenores que la media: ");
        for(int numero: arreglo){
            if(numero<media){
                System.out.print(numero+"");
        
            }

        }
        */

        
         /*/
        //Ejercicio 15: Encontrar el trabajor con el sueldo mas cercano al promedio
       
        String[] nombres = { "Messi", "Ronaldo", "Neymar", "Petro"};// Nombre de los trajadores
        int[] sueldos= { 1000, 1200,1100,1300};// Sueldo de los trabajadores
        int suma =0;
        for(int sueldo: sueldo){
            suma += sueldo;
        }
        double promedio = (double) suma/ sueldo.length; // Operacion para hallar el promedio 
        System.out.println("Sueldo promedio: "+ promedio);
        double diferenciaMinima= Double.MAX_VALUE; //Inicializamos con el valor posible 
        for(int sueldo: sueldo){
            double diferencia = Math.abs(sueldo-promedio);// Calculamos la diferencia en el promedio
            if( diferencia< diferenciaMinima){
                diferenciaMinima=diferencia;
            }
        }
        System.out.print(" Trabajadores con sueldos mas cercanos al promedio: ");
        for(int i=0 i<sueldos.length; i++){
            if(Math.abs(sueldos[i]-promedio)==diferenciaMinima){
                System.out.print(nombres[i]+"");
            }
        }
        */
    


    // Ejercicio 16: Informacion de profesores
   
        String[]profesores= {"Ana", "Carlos","Marta","Luis"};
        int[] edades={ 45,30,50,40};
        int menor= edades [0], mayor= edades[0];
        String profesorMenor= profesores[0], profesorMayor= profesores[0];
        int suma= 0;
        // Recorremos el arreglo de edades para calcular la suma y encontrar el profesor más joven y más viejo
        for(int i=0; i < edades.length; i++){
            suma += edades[i];
            if(edades [i]< menor){ // Si la edad actual es menor que la menor registrada
                menor= edades[i];
                profesorMenor = profesores[i];
            
            }
            if(edades [i]> mayor){ 
                menor= edades[i];
                profesorMayor = profesores[i];
            
            }
        }
        // Calculamos el promedio de las edades
        double promedio = (double)suma/edades.length;
        System.out.println("Edad promedio: " + promedio);
        System.out.println("Profesor mas joven: " + profesorMenor + " (" menor + "años)" );
        System.out.println("Profesor con mayor edad: " + profesorMayor + " (" mayor + "años)" );
    





    
    }

}
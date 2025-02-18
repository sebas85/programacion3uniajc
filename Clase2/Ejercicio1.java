package Clase2;

import java.util.Arrays;
import java.util.Scanner;

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


        //Ejercicio 8

        int[] n = new int[30]; // Arreglo de 30 números

        /*/ Entrada de datos
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
        System.out.println(op.mostrarElementos(n));
        System.out.println("Número mayor: " + mayor + " (se repite " + repeticionesMayor + " veces)");
        System.out.println("Número menor: " + menor + " (se repite " + repeticionesMenor + " veces)");
        
        */

        
        








    }    

 }
package Clase2;

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
          


            //EJERCICIO 1

            System.out.println("Por favor digite el tamano del arreglo"); 
            int n = sc.nextInt();  

            int [] numeros = new int[n]; // se crea el arreglo  y se toma deacuerdo al usuario

            






        }
    }


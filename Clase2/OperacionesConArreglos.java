package Clase2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesConArreglos {
    Scanner sc = new Scanner(System.in);

    public String mostrarElementos(int[] a) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            cad += "a[ " + i + " ] = " + a[i] + "\n";
        }
        return cad;
    }

    public int sumarElementos(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    public double promedioElementos(int[] a) {
        double suma = 0.0, promedio = 0.0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        promedio = suma / a.length;
        return promedio;
    }



    public int[]llenaArregloAleatorio(int tam){
    int[] a = new int[tam];
    for (int i = 0; i < a.length; i++){
        a[i] = (int) (Math.random() * 100);
    } 
    return a;
    }

    public int sumaElementos(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

  
    //Ejercicio 2
    public void NetoAPagarEmpleado(int n) {

        double[] sueldos = new double[n];     // Sueldos de los empleados
        double[] asignaciones = new double[n];  // Asignaciones totales de cada empleado
        double[] deducciones = new double[n];  // Deducciones de cada empleado
        double[] netoPagar= new double[n];  // Neto a pagar a cada empleado

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado " + (i + 1) + ":");
            System.out.print("Ingrese el sueldo: ");
            sueldos[i] = sc.nextDouble();

            System.out.print("Ingrese las asignaciones: ");
            asignaciones[i] = sc.nextDouble();

            System.out.print("Ingrese las deducciones: ");
            deducciones[i] = sc.nextDouble();
        
            netoPagar[i] = sueldos[i] + asignaciones[i] - deducciones[i];
        }

        System.out.println("\nPago neto por empleado: ");
        for(int i = 0; i < n; i++) {
            System.out.println("Empleado " +(i + 1)+": " + " Neto a pagar = " + netoPagar[i]);
        }
    }


    //Ejercicio 3

    // Método para sumar los números impares de un arreglo
    public int sumaPares(int[] numeros) {
        int suma = 0;

        for (int num : numeros) {    // Recorre cada número en el arreglo
            if (num % 2 == 0) {      // Verifica si el número es par
                suma += num;         // Acumula el número par
            }
        }
        return suma;
    }

     // Método para sumar los números impares de un arreglo
     public int sumaImpares(int[]numeros) {
        int suma = 0;
        for (int num : numeros) {      // Recorre cada número en el arreglo
            if (num % 2 != 0) {       // Verifica si el número es impar
                suma += num;          // Acumula el número impar
            }
        }
        return suma;

    }


    //Ejercicio 4
    // Método para encontrar la edad mayor en dos arreglos
    public int encontrarMayor(int[] edades1, int[] edades2) {
        int mayor = edades1[0]; // Suponemos que el mayor es el primer valor del arreglo 1

        // Buscar el numero mayor en el primer arreglo
        for (int edad : edades1) {
            if (edad > mayor) {
                mayor = edad;
            }
        }

        // Buscar el numer  mayor en el segundo arreglo
        for (int edad : edades2) {
            if (edad > mayor) {
                mayor = edad;
            }
        }

        return mayor;
    }
    
    
    //Ejercicio 5
    public void productoMayorGasto (int n1){
        double [] precioU = new double[n1];
        int [] cantidadC = new int [n1];
        String [] descripcion = new String[n1];
        double [] totalG = new double[n1];

        for (int i = 0; i < n1; i++) {
            System.out.println("\nProducto " + (i+1));
            System.out.print("Descripción: ");
            descripcion[i] = sc.nextLine();
            System.out.print("Precio unitario: ");
            precioU[i] = sc.nextDouble();
            System.out.print("Cantidad comprada: ");
            cantidadC[i] = sc.nextInt();
            
            totalG[i] = precioU[i] * cantidadC[i];
        }

        System.out.println("\n  RESULTADO  ");
        for (int i = 0; i < n1; i++) {
            System.out.println("Producto: " + descripcion[i] + "  *Total Gastado: $" + totalG[i]);
        }

    }
         
    
    
    //Ejercicio 6
    
    public void gananciasVivienda(int n){

        double [] arquiler = new double[n];
        double [] porcentajes  = new double[n];
        double [] ganancias = new double[n];

        for(int i = 0 ; i<n; i++){
            System.out.println("\nVivienda " +(i+1)+ ":");
            System.out.print("Arquiler mensual = ");
            arquiler[i]=sc.nextDouble();
            System.out.print("Porcentaje de ganacia: ");
            porcentajes[i]=sc.nextDouble();
           
            ganancias[i] = arquiler[i] * (porcentajes[i]/100); 
            
        }


        System.out.println("    \nResultados    ");
        for(int i=0 ; i< n ; i++){
            System.out.println("Vienda " +(i+1)+ "  -Arquiler: $" +arquiler[i]+ " -Ganancias: " +ganancias[i]);  
        }       

    }

        //Ejercicio 7
    public void areglosParesImpares(int[] a) {

        List<Integer> pares = new ArrayList<>();  //Crea una nueva lista llamada pares que almacenará números enteros
        List<Integer> impares = new ArrayList<>();

        for (int num : a) {     //itera a través de cada elemento del arreglo p en cada iteración el valor del elemento se asigna a la variable num.
            
            if (num % 2 == 0) {
                pares.add(num);     //Si la condición  anterior es verdadera se agrega num a la lista pares.
            } else {
                impares.add(num);  // si es falsa agrega num a la lista impares
            }
        }

        System.out.println("\nArreglo de números pares:");
        System.out.println(pares);
        System.out.println("Arreglo de números impares:");
        System.out.println(impares);
    }
    


    //Ejercicio 8
     
     // Método para encontrar el número mayor en el arreglo
        public int encontrarMayor(int[] n) {
            int mayor = n[0];      // Suponemos que el primer número es el mayor
            for (int num : n) {    //Inicia un bucle "for-each" que recorre cada elemento del arreglo n,eEn cada iteración, el valor se asigna a la variable num.
           
                if (num > mayor) {  //Compara el valor actual de num con el valor actual de mayor.
                    mayor = num;
                }
            }
            return mayor;
        }

     // Método para encontrar el número menor en el arreglo
        public int encontrarMenor(int[] n) {
            int menor = n[0];        // Suponemos que el primer número es el menor
            for (int num : n) {
                if (num < menor) {
                    menor = num;
                }
            }
            return menor;
        }


    // Método para contar cuántas veces aparece un número en el arreglo
    public int contarRepeticiones(int[] n, int valor) {
        int contador = 0;
        for (int num : n) {
            if (num == valor) {
                contador++;
            }
        }
        return contador;
    }

    //Ejercicio 9
    public int vecesNumero(int[] arreglo, int numero) {
        int contador = 0;
        for (int num : arreglo) { // Recorremos el arreglo
            if (num == numero) { // Comparamos cada número con el buscado
                contador++;
            }
        }
        return contador;
    }

    //Ejercicio 10
    public int[] sumarOpuestos(int[] a) {
        int n = a.length;
        int nuevoTamaño = (n + 1) / 2; // Tamaño del nuevo arreglo B
        int[] B = new int[nuevoTamaño];

        for (int i = 0; i < nuevoTamaño; i++) {
            int opuesto = n - 1 - i; // Índice del elemento opuesto
            if (i == opuesto) { 
                B[i] = a[i]; // Si es el centro del arreglo impar, se mantiene
            } else {
                B[i] = a[i] + a[opuesto]; // Suma los elementos opuestos
            }
        }
        return B;
    }

    //Ejercicio 11
    public int[][] separarNumeros(int[] A) {
        ArrayList<Integer> negativos = new ArrayList<>(); //crea las listas que almacenan datos de diferentes tipos
        ArrayList<Integer> ceros = new ArrayList<>();
        ArrayList<Integer> positivos = new ArrayList<>();

        // Recorrer el arreglo y clasificar los elementos
        for (int num : A) {            //Itera a traves de cada uno los elementos de A
            if (num < 0) {            //comprueba si el valor de num es menor que o 
                negativos.add(num);   //si es menor que cero,agrega num a la lista negativos
            } else if (num == 0) {
                ceros.add(num);
            } else {
                positivos.add(num);
            }
        }
        // Convertir listas a arreglos
        int[] arrNegativos = negativos.stream().mapToInt(i -> i).toArray();   //Crea un "stream" (flujo) de elementos a partir de la lista negativos
        int[] arrCeros = ceros.stream().mapToInt(i -> i).toArray();           //(mapToInt) Aplica una función de mapeo a cada elemento del stream 
        int[] arrPositivos = positivos.stream().mapToInt(i -> i).toArray();   //caso, la función i -> i simplemente toma cada elemento i y lo devuelve sin cambios.
                                                                              //(toArray)Convierte el stream de enteros primitivos en un arreglo de enteros 
                                                                              
        // Retornar los tres arreglos en una matriz
        return new int[][] { arrNegativos, arrCeros, arrPositivos };


    }

     //Ejercicio 15
     public String nombresSueldos(String[] n, int[] s) {
        int suma = 0;
        // Calcular la suma de los sueldos de los empleados
        for (int i = 0; i < s.length; i++) {
            suma += s[i];
        }

        // Calcular el promedio de los sueldos
        double promedio = suma / s.length;

        String cad = "";
        int contador = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] >= promedio) {
                cad += n[i] + "\n";
                contador++;
            }
        }

        cad += "Fueron " + contador + " los empleados que tienen sueldo por encima del promedio: " + promedio;

        return cad;
    }
    
   
   
   
        
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    

    





    




}













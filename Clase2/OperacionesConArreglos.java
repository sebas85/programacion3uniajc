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









}

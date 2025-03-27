package Clase8;

import java.util.ArrayDeque;
import java.util.Queue;

public class EjecutarCola {
    public static void main(String[] args) {
        
        Queue<Integer> numeros = new ArrayDeque<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);

        //Mostrar los elementos de la cola
        System.out.println(numeros); //[1, 2, 3, 4, 5, 6, 7]

        //Muestra el primer elemento de la cola
        System.out.println(numeros.element()); //1

        //Agrega un elemento a la cola
        numeros.offer(8);

        //Mostrar los elementos de la cola
        System.out.println(numeros); //[1, 2, 3, 4, 5, 6, 7, 8]

        //Remueve la cabeza de la cola
        System.out.println(numeros.poll()); //1

        //Mostrar los elementos de la cola
        System.out.println(numeros); //[2, 3, 4, 5, 6, 7, 8]

        //Remueve la cabeza de la cola
        System.out.println(numeros.remove()); //2

        //Mostrar los elementos de la cola
        System.out.println(numeros); //[3, 4, 5, 6, 7, 8]

        //Tamaño de la cola
        System.out.println((numeros.size()));

    }
}
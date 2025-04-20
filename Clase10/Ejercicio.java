
import java.util.*;

public class Ejercicio {

    public static void main(String[] args) {

        Stack<String> nombre = new Stack<String>();

        nombre.push("Adam");
        nombre.push("Sarah");
        nombre.push("Malcon");

        System.out.println(nombre);

        String[] iniciales = new String[nombre.size()];

        nombre.toArray(iniciales);

        for (int i = 0; i < iniciales.length; i++) {
            iniciales[i] = String.valueOf(iniciales[i].substring(0, 1));
        }

        Arrays.sort(iniciales);
        System.out.println(Arrays.toString(iniciales));

    }

    public static class Ejercicio7 {
        public static void main(String[] args) {

            Stack<String> letras = new Stack<>();

            letras.push("zorro");
            letras.push("oso");
            letras.push("gato");

            System.out.println("Pila Original: " + letras);

            while (!letras.isEmpty()) {

                String palabra = letras.pop(); //quita las cima de la pila

                if (palabra.length() == 4) {     //si el tamano de la pabra es igual 4
                    System.out.println("4:" + palabra);
                } else if (palabra.length() < 4) {
                    System.out.println("3: " + palabra);
                }else{
                    System.out.println("Pila esta vacia");
                }
             
            }

        }

    }

}
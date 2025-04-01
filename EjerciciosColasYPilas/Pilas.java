package EjerciciosColasYPilas;

import java.util.Stack;

public class Pilas {

     // EJERCICIO 9.1
    public static class Pila {

        public static void main(String[] args) {
            Stack<Integer> p = new Stack<>();

            int x = 4, y; // variables enteras x con valor 4, y sin inicializar.

            p.push(x); // inserta x(4) a la pila
            System.out.println("\n" + p.peek()); // muestra la cima de la pila

            y = p.pop(); // quita el último valor de la pila (4) y lo asigna a y.
            p.push(32); // inseta 32 a la pila

            p.push(p.pop()); // quita el elemnto de la pila y lo vuelve a insertar

            do { //
                System.out.println("\n" + p.pop()); // imprime el último elemento extraido de la pila.

            } while (!p.empty()); // el ciclo continua hasta que la pila se vacie

        }
    }

    // EJERCICIO 9.2
    public static class ejercicio92 {
        public static void main(String[] args) {

            Stack<String> pila = new Stack<>(); // Crea una pila de Strings.

            System.out.println("La pila esta vacia? " + pila.empty()); // pregunta si la pila esta vacia

            // llenado

            pila.push("Gato");
            pila.push("Tigre");
            pila.push("Leon");
            pila.push("Pantera");
            pila.push("Guepardo");

            // Imprimir
            System.out.println("Pila original: " + pila);

            // Uso del metodo mostrarPila
            System.out.println("Pila auxiliar, elementos: ");
            mostrarPila(pila);

        }

        // Metodo para mostrar los elementos de la pila mientras los mueve a una pila
        // auxiliar
        public static void mostrarPila(Stack<String> pila) {
            Stack<String> auxiliarP = new Stack<>(); // Creamos una pila auxiliar.

            // Mientras la pila original no esté vacía, desapilamos e imprimimos sus
            // elementos.
            while (!pila.empty()) { // se repite hasta la pila este vacia
                String felinos = pila.pop(); // Sacamos el elemento de la pila.
                auxiliarP.push(felinos); // Lo pasamos a la pila auxiliar
                System.out.println(felinos); // imprime el elmento sacado

            }
        }
    }

    // EJERCICIO 9.3
    public static class ejercicio93 {

        public static void main(String[] args) {
            String expresionInfija = "(x-y)/(z+w)-(z+y)^x"; // expresión en notación infija
            String expresionPostfija = convertirPostfijo(expresionInfija); // Convertir la expresión infija a notación
                                                                           // postfija.

            System.out.println("La expresion original es: " + expresionInfija); // imprime expres
            System.out.println("Expresion convertida postfija: " + expresionPostfija);

        }

        // Método para precedencia a los operadores
        public static int precedencia(char operador) {
            switch (operador) {

                case '^':
                    return 3;

                case '*':
                case '/':

                    return 2;
                case '+':
                case '-':
                    return 1;

                default: // Para otro carácter, retorna -1.
                    return -1;
            }
        }

        public static String convertirPostfijo(String expresionInfija) {
            Stack<Character> pila = new Stack<>(); // Pila para almacenar operadores.
            StringBuilder resultado = new StringBuilder(); // StringBuilder para construir la expresión postfija.

            // Recorrido para cada carácter de la expresioInfija
            for (char c : expresionInfija.toCharArray()) { // Si es un número o variable, se agrega a resultado
                if (Character.isLetterOrDigit(c)) {
                    resultado.append(c);
                } else if (c == '(') { // Si es un parentesis de apertura, se apila

                    pila.push(c);

                } else if (c == ')') { // Si es parentesis de cierre:

                    // Desapila hasta encontrar el paréntesis de apertura
                    while (!pila.isEmpty() && pila.peek() != '(') {
                        resultado.append(pila.pop());
                    }
                    pila.pop(); // Elimina el '('

                } else { // si el operador
                    // Mientras la pila no esté vacía y el operador en la cima tenga mayor o igual
                    // precedencia:
                    while (!pila.isEmpty() && precedencia(pila.peek()) >= precedencia(c)) {
                        resultado.append(pila.pop()); // Extraer y agregar el operador al resultado.
                    }
                    pila.push(c); // Apilamos el operador actual
                }
            }
            // ExtraeR todos los operadores restantes de la pila y los agregar al resultado
            while (!pila.isEmpty()) {
                resultado.append(pila.pop());
            }

            return resultado.toString(); // Retorna la expresión convertida a postfija
        }

        // EJERCICIO 9.4
        public static class ejercico94 {

            public static void main(String[] args) {
                int[] a = { 1, 2, 3, 45, 62, 78, 8, 9, 13, 87 };
                System.out.println(mostrarElementos(a));

                Stack<Integer> pila2 = new Stack<>();

                for (int i = 0; i < a.length; i++) {

                    pila2.push(a[i]);

                }

                System.out.println("Elementos en la pila: " + pila2);
            }

            public static String mostrarElementos(int[] a) {
                String cad = "";
                for (int i = 0; i < a.length; i++) {
                    cad += "a[ " + i + " ] = " + a[i] + "\n";
                }
                return cad;
            }
        }

    }
    
}

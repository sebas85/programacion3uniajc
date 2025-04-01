package EjerciciosColasYPilas;

import java.util.ArrayDeque;
import java.util.Queue;

public class Colas {

     public static class CompararColas {
    
        public static void main(String[] args) {
        
            Queue<Integer> cola1 = new ArrayDeque<>();
            cola1.add(1);
            cola1.add(2);
            cola1.add(3);
    
            Queue<Integer> cola2 = new ArrayDeque<>();
            cola2.add(1);
            cola2.add(2);
            cola2.add(4);

            System.out.println("Las colas (cola1 y cola2) son identicas? " + sonIdenticas(cola1, cola2));
        }   
    }

    public static <T> boolean sonIdenticas(Queue<T> colaA, Queue<T> colaB) {
        // Compara tamaños (si tamano es diferentes, no son iguales)
        if (colaA.size() != colaB.size()) {
            return false;
        }

        //Crea copias temporales de las colas  para no modificar las originales
        Queue<T> copiaA = new ArrayDeque<>(colaA);
        Queue<T> copiaB = new ArrayDeque<>(colaB);

        // Paso 3: Comparar elemento por elemento
        while (!copiaA.isEmpty()) {
            T elementoA = copiaA.remove(); //quita el ultimo elemento 
            T elementoB = copiaB.remove();

            if (!elementoA.equals(elementoB)) {
                return false;
            }
        }

        return true; // Si todos los elementos coinciden
    } 

    //EJERCICIO 10.3

    public static  class Supermercado {
    
        public static void main(String[] args) {
        
            //cola para los 25 carritos disponibles 
            Queue<Integer> carritos = new ArrayDeque<>();
            // Crear colas para las 3 
            Queue<Integer> caja1 = new ArrayDeque<>();
            Queue<Integer> caja2 = new ArrayDeque<>();
            Queue<Integer> caja3 = new ArrayDeque<>();
    
            // Llenar la cola de carritos disponibles 
            for (int i = 1; i <= 25; i++) {
                carritos.add(i); 
            }
    
            // SIMULACION DE CLIENTES ---
            // Simula la llegada de 30 clientes 
            for (int clienteId = 1; clienteId <= 30; clienteId++) {
                System.out.println("\n--- Cliente " + clienteId + " llega al supermercado ---");
    
                // Verifica si hay carritos disponibles 
                if (!carritos.isEmpty()) {
                    //Asigna carrito al cliente 
                    int carrito = carritos.poll();
                    System.out.println("Cliente " + clienteId + " toma el carrito " + carrito);
    
                    // Compara la caja con menos tamano en clientes 
                    Queue<Integer> cajaElegida = caja1;
                    if (caja2.size() < cajaElegida.size()) cajaElegida = caja2;
                    if (caja3.size() < cajaElegida.size()) cajaElegida = caja3;
    
                    //  Cliente se forma  en la caja elegida 
                    cajaElegida.offer(clienteId);
                    System.out.println("Cliente " + clienteId + " se forma en la caja " + 
                        (cajaElegida == caja1 ? "1" : cajaElegida == caja2 ? "2" : "3"));
    
                    // Simula el pago: atender al primer cliente de la caja 
                    if (!cajaElegida.isEmpty()) {
                        int clienteAtendido = cajaElegida.poll();
                        // Libera el  carrito (
                        carritos.offer(carrito);
                        System.out.println("Cliente " + clienteAtendido + " paga y libera el carrito " + carrito);
                    }
                } else {
                    //Si no hay carritos, el cliente espera 
                    System.out.println("Cliente " + clienteId + " espera: NO hay carritos disponibles.");
                }
            }
    
            // --- RESULTADOS FINALES ---
            // 12. Mostrar estado final de las cajas y carritos (similar a las líneas 20, 29, 35, 41)
            System.out.println("\n--- Estado final de las cajas ---");
            System.out.println("Caja 1: " + caja1);
            System.out.println("Caja 2: " + caja2);
            System.out.println("Caja 3: " + caja3);
            System.out.println("Carritos disponibles: " + carritos.size());
        }
    }

    
}

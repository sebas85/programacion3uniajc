// Clase para representar un nodo del árbol binario
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    // Constructor del nodo
    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}

// Clase del Árbol Binario
public class ArbolBinario {
    Nodo raiz;

    // Constructor del árbol (inicialmente vacío)
    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un nuevo nodo
    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Si el valor es menor, lo insertamos en el subárbol izquierdo
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } 
        // Si el valor es mayor, lo insertamos en el subárbol derecho
        else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    // Recorrido en orden (izquierda, raíz, derecha)
    public void inOrden() {
        System.out.print("Recorrido inOrden: ");
        inOrdenRec(raiz);
        System.out.println();
    }

    private void inOrdenRec(Nodo nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrdenRec(nodo.derecho);
        }
    }

    // Recorrido preorden (raíz, izquierda, derecha)
    public void preOrden() {
        System.out.print("Recorrido preOrden: ");
        preOrdenRec(raiz);
        System.out.println();
    }

    private void preOrdenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrdenRec(nodo.izquierdo);
            preOrdenRec(nodo.derecho);
        }
    }

    // Recorrido postorden (izquierda, derecha, raíz)
    public void postOrden() {
        System.out.print("Recorrido postOrden: ");
        postOrdenRec(raiz);
        System.out.println();
    }

    private void postOrdenRec(Nodo nodo) {
        if (nodo != null) {
            postOrdenRec(nodo.izquierdo);
            postOrdenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    // Método principal para probar el árbol
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertamos algunos valores
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Mostramos los recorridos
        arbol.inOrden();   // Debería imprimir en orden ascendente
        arbol.preOrden();  // Raíz antes que sus hijos
        arbol.postOrden(); // Raíz al final
    }
}

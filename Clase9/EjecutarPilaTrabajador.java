import java.util.Stack;

public class EjecutarPilaTrabajador {
    public static void main(String[] args) {
       
        Stack<Trabajador> trabajadores = new Stack<>();
        // Agregar trabajadores a la pila
        
        Trabajador t1 = new Trabajador ("1.111.542032", "Leonardo Angel Gomez", 2200.00);
        Trabajador t2 = new Trabajador ("1.111.542033", "Maria Fernanda Lopez", 2500.00);
        Trabajador t3 = new Trabajador ("1.111.542034", "Carlos Alberto Torres", 3000.00);

        trabajadores.push(t1);
        trabajadores.push(t2);
        trabajadores.push(t3);

        System.out.println(trabajadores);

        


    }
}
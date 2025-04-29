import java.util.ArrayList;

class Vehiculo {
    String categoria;
    int cantidad;
    double porcentajeGasolina;
    double porcentajeDiesel;
    double porcentajeGas;

    public Vehiculo(String categoria, int cantidad, double gasolina, double diesel, double gas) {
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.porcentajeGasolina = gasolina;
        this.porcentajeDiesel = diesel;
        this.porcentajeGas = gas;
    }
}

public class EjercicioCamiones {

    // Factores de emisión en kg CO2 por vehículo
    public static final double FACTOR_GASOLINA = 2.3;
    public static final double FACTOR_DIESEL = 2.7;
    public static final double FACTOR_GAS = 2.0;

    public static void main(String[] args) {
        // Lista de vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Agregamos datos (cantidad y porcentajes)
        vehiculos.add(new Vehiculo("Camiones Livianos", 400000, 0.30, 0.40, 0.30));
        vehiculos.add(new Vehiculo("Camiones Medianos", 280000, 0.25, 0.70, 0.05));
        vehiculos.add(new Vehiculo("Camiones Pesados", 380000, 0.10, 0.80, 0.10));
        vehiculos.add(new Vehiculo("Tractocamiones", 1150000, 0.05, 0.90, 0.05));
        vehiculos.add(new Vehiculo("Volquetas", 936000, 0.40, 0.40, 0.20));


        System.out.println("Cálculo de emisiones de CO2 por categoría:\n");

        for (Vehiculo v : vehiculos) {
            int cantGasolina = (int)(v.cantidad * v.porcentajeGasolina);
            int cantDiesel = (int)(v.cantidad * v.porcentajeDiesel);
            int cantGas = (int)(v.cantidad * v.porcentajeGas);

            double co2Gasolina = cantGasolina * FACTOR_GASOLINA;
            double co2Diesel = cantDiesel * FACTOR_DIESEL;
            double co2Gas = cantGas * FACTOR_GAS;

            double totalVehiculoCO2 = co2Gasolina + co2Diesel + co2Gas;

            System.out.println("- " + v.categoria);
            System.out.println("  Gasolina: " + cantGasolina + "  Emisiones: " + co2Gasolina + " kg CO2");
            System.out.println("  Diesel:   " + cantDiesel + "  Emisiones: " + co2Diesel + " kg CO2");
            System.out.println("  Gas:      " + cantGas + "  Emisiones: " + co2Gas + " kg CO2");
            System.out.println("  Total categoría: " + totalVehiculoCO2 + " kg CO2\n");
        }

    }
}

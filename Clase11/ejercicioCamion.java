public class EmisionVehiculos {

    public static void main(String[] args) {

        // Factores de emisión por combustible (kg CO₂ por vehículo)
        double factorGas = 2.75;
        double factorDiesel = 2.68;
        double factorGasolina = 2.31;

        // Datos de cada tipo de vehículo
        mostrarEmision("Camiones Livianos", 400000, 30, 40, 30, factorGasolina, factorDiesel, factorGas);
        mostrarEmision("Camiones Medianos", 280000, 25, 40, 35, factorGasolina, factorDiesel, factorGas);
        mostrarEmision("Camiones Pesados", 380000, 10, 40, 50, factorGasolina, factorDiesel, factorGas);
        mostrarEmision("Tractocamiones", 1150000, 5, 90, 5, factorGasolina, factorDiesel, factorGas);
        mostrarEmision("Volquetas", 936000, 10, 40, 50, factorGasolina, factorDiesel, factorGas);
    }

    // Función que recibe los datos y hace los cálculos
    public static void mostrarEmision(String nombre, int total, int porcGasolina, int porcDiesel, int porcGas,
                                      double gaso, double die, double gas) {

        System.out.println("\nVehículo: " + nombre);

        int gasoVeh = (total * porcGasolina) / 100;
        int dieselVeh = (total * porcDiesel) / 100;
        int gasVeh = (total * porcGas) / 100;

        double totalGaso = gasoVeh * gaso;
        double totalDiesel = dieselVeh * die;
        double totalGas = gasVeh * gas;

        System.out.println("Gasolina: " + gasoVeh + " vehículos -> " + totalGaso + " kg CO₂");
        System.out.println("Diésel: " + dieselVeh + " vehículos -> " + totalDiesel + " kg CO₂");
        System.out.println("Gas: " + gasVeh + " vehículos -> " + totalGas + " kg CO₂");
    }
}
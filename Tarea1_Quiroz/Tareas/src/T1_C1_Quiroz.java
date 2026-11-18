import java.util.Scanner;
public class T1_C1_Quiroz {
    static double leerConsumo(Scanner sc) {
        double metroscubicos;
        do {
            System.out.print("Ingrese el consumo de agua: ");
            metroscubicos = sc.nextDouble();
            if (metroscubicos < 0) {
                System.out.println("Error: el consumo no puede ser negativo.");
            }
        } while (metroscubicos < 0);
        return metroscubicos;
    }
    static double calcularValor(double metroscubicos) {
        double valor;
        if (metroscubicos <= 15) {
            valor = metroscubicos * 0.40;
        } else {
            valor = (15 * 0.40) + ((metroscubicos - 15) * 0.75);
        }
        return valor + 2.50;
    }
    static void mostrarPlanilla(double metroscubicos, double valor) {
        System.out.println("\n----- PLANILLA DE AGUA -----");
        System.out.println("Consumo: " + metroscubicos + " m3");
        System.out.printf("Total a pagar: $%.2f%n", valor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = leerConsumo(sc);
        double total = calcularValor(consumo);
        mostrarPlanilla(consumo, total);
    }
}

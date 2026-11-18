import java.util.Scanner;
public class T1_C3_Quiroz {
    static double volumen(double lado) {
        return lado * lado * lado;
    }
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }
    static double volumen(double largo, double ancho, double altura) {
        return largo * ancho * altura;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n----- MENU DE VOLUMENES -----");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Prisma rectangular");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Volumen del cubo: " + volumen(lado));
                    break;
                    case 2:
                        System.out.print("Ingrese el radio: ");
                        double radio = sc.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura = sc.nextDouble();
                        System.out.println("Volumen del cilindro: " + volumen(radio, altura));
                        break;
                        
                        case 3:
                            System.out.print("Ingrese el largo: ");
                            double largo = sc.nextDouble();
                            System.out.print("Ingrese el ancho: ");
                            double ancho = sc.nextDouble();
                            System.out.print("Ingrese la altura: ");
                            double h = sc.nextDouble();
                            System.out.println("Volumen del prisma: " + volumen(largo, ancho, h));
                            break;

                            case 4:
                                System.out.println("Programa finalizado.");
                                break;
                                default:
                                    System.out.println("Opcion incorrecta.");
                                }
                            } while (opcion != 4);
                        }
}
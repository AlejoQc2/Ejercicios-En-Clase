import java.util.Scanner;
public class T1_C4_Quiroz {
    static int contarDigitos(int n) {
        int contador = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            contador++;
            n = n / 10;
        }
        return contador;
    }
    static int potencia(int b, int e) {
        int resultado = 1;
        for (int i = 1; i <= e; i++) {
            resultado = resultado * b;
        }
        return resultado;
    }
    static boolean esArmstrong(int n) {
        int original = n;
        int digitos = contarDigitos(n);
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma = suma + potencia(digito, digitos);
            n = n / 10;
        }
        return suma == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();
        if (esArmstrong(n)) {
            System.out.println("Es un numero Armstrong.");
        } 
        else {
            System.out.println("No es un numero Armstrong.");
        }
    }
}
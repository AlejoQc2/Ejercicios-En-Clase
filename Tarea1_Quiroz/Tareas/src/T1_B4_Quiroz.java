public class T1_B4_Quiroz {
    static int total = 0;
    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            sumar(i);
        }
        System.out.println("Total acumulado: " + total);
        int total = 5;
        System.out.println("Nuevo total local: " + total);
    }
}
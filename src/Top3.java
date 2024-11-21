import java.util.Scanner;

public class Top3 {
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinchi katetni kiriting:");
        double a = scanner.nextDouble();
        System.out.println("Ikkinchi katetni kiriting:");
        double b = scanner.nextDouble();

        System.out.println("Gipotenuzaning uzunligi: " + findHypotenuse(a, b));
    }
}

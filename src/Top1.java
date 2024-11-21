import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matnni kiriting:");
        String input = scanner.nextLine();

        int evenSum = 0;
        int oddProduct = 1;
        boolean hasOdd = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddProduct *= num;
                    hasOdd = true;
                }
            }
        }

        System.out.println("Juft raqamlar yig'indisi: " + evenSum);
        System.out.println("Toq raqamlar ko'paytmasi: " + (hasOdd ? oddProduct : 0));
    }
}

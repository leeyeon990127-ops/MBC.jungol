package q9128;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + (num1 +num2) );
        System.out.printf("%.2f + %.2f = %.2f\n", num3, num4, (num3 + num4));

    }
}

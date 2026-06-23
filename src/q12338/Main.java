package q12338;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();
        int num1, num2;

        if (A <= B) {
            num1 = A;
            num2 = B;
        } else {
            num1 = B;
            num2 = A;

            for (int i = num1; i <= num2; i++) {   //행
                for (int j = 0; j <= 9; j++) {
                    System.out.println(i + "*" + j + "=" + (i*j));
                }
                System.out.println();
            }
        }
    }
}

package q9074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[11];

        while (true) {
            int n = sc.nextInt();

            if(n < 1 || n > 10) {
                break;
            }
            count[n]++;
        }
        for(int i =1; i<10; i++) {
            if (count[i] >0) {
                System.out.println(i + " : " + count[i] + "개");
            }
        }
        sc.close();
    }
}

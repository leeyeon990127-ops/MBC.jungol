package q5058;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < (n-1-i); j++) {     //공백
                System.out.print(" ");
            }
            for (int j = 0; j < (i+1); j++) {       //별
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

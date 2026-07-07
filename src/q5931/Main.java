package q5931;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++) {  //행
            for(int j =0; j< n; j++) {  //열
                System.out.print((i+1) * (j+1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

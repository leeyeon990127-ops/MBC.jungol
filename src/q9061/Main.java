package q9061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for(int i = 0; i < n; i++ ) {   //n줄 만큼 반복
            for(int j = 0; j<= i; j++) {    //줄마다 몇 개의 숫자를 출력할지 결정
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
        sc.close();

    }
}

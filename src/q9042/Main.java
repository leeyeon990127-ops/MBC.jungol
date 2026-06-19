package q9042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int [] arr = new int [n];
        int sum = 0;

        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double)sum / n;

        System.out.println("입력된 자료의 개수 = " + n);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의평균 = %.2f\n", avg);

    }
}

package q9052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;  // 5명의 성적
        int[] arr = new int [n];
        int sum = 0;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();

        double avg = (double)sum / 5;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

    }
}

package q9044;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int sum = 0;
        int count = 0;  //홀수의 개수를 저장할 변수

        //6개의 정수를 입력받는 for 문
        for (int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //입력받은 배열을 돌며 홀수찾기
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }

        int avg = sum / count;


        System.out.println("홀수의 합 = " + sum);
        System.out.println("홀수의 평균 = " + avg);


    }
}

package q9067;

//스캐너 -> 배열입력 -> for문 -> arr의 인덱스 값 추출 -> 2,4,9 인덱스 번호 출력

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(arr[2] + " " + arr[4] + " " + arr[9]);
    }

}

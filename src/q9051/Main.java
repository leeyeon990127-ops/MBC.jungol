package q9051;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [10];
        int count = 0; // 짝수의 개수를 저장할 변수(초기값 0)

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                count++; //짝수를 찾을 때마다 1씩 증가
            }
        }
        sc.close();

        System.out.println("입력받은 짝수는 " + count + "개입니다.");
    }
}

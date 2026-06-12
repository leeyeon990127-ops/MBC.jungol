package q9035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("세 수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int max = a;    // 가장 큰 수를 저장할 입시 변수
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

//        int max = 0;
//        if (inp1 < inp2) {
//            if (inp2 < inp3) {
//                max = inp3;
//            } else {
//                max = inp2;
//            }
//        } else {
//            if (inp1 < inp3) {
//                max = inp3;
//            } else {
//                max = inp1;
//            }
        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
    }
}

// 배열 문제풀이
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("세 수를 입력하세요.");
//
//        // 1. 크기가 3인 정수형 배열을 만듭니다.
//        int[] arr = new int[3];
//
//        // 2. for문을 사용해서 입력을 3번 받아 배열의 각 방에 집어넣습니다.
//        for (int i = 0; i < 3; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // 3. 일단 첫 번째 방(arr[0])의 값을 가장 큰 수(max)로 지정해 둡니다.
//        int max = arr[0];
//
//        // 4. 나머지 방들(1번째, 2번째 방)을 돌면서 max보다 큰 수가 있는지 확인합니다.
//        for (int i = 1; i < 3; i++) {
//            // 만약 현재 방의 숫자가 max보다 크다면 max를 갈아끼웁니다.
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        // 5. 최종 max 값을 출력합니다.
//        System.out.println(max);
//
//        sc.close();
//    }
//}
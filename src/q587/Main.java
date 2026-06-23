package q587;

import java.util.Scanner;

public class Main {
    public static void printRecursive(int n) {
        if (n <= 0) {   //탈출 조건n = 0되면 호출 멈춤
            return;
        }
        System.out.println("recursive");    //현재 상태 출력
        printRecursive(n-1);    // n을 1 줄여서 다시 자기 자신을 부름
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printRecursive(n);  //함수 호출

        sc.close();
    }
}

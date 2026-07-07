package q9114;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            char ch = sc.next().charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("소문자 입니다. ");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("대문자 입니다. ");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("숫자문자입니다. ");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }

        }

    }
}

package q9022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // 5
        int b = sc.nextInt();   // 6

        int c = ++a + b--;      // 12
        // ++a a는 원래 5에서 6이 된다(전위 연산: 증가 후 대입)
        // b-- 원래 b의 값인 6이 계산에서 쓰이고 그후 b는 다시 5가 됨(후위 연산: 대입 후 감소)
        sc.close();

        System.out.printf("a = %d, b = %d,  c = %d\n", a, b, c);
        System.out.print("a = " + a);
        System.out.print(", b = " + b);
        System.out.print(", c = " + c);

    }
}

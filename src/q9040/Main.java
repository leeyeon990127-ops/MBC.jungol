package q9040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int sum = 0;

        while (num <= 10) {
//            System.out.println(num);
            sum += num; //sum에 현재 num을 더해서 다시 sum에 저장
            num++;
        }
        System.out.println("1부터 10까지의 합 = " + sum);
        System.out.println("while문이 끝난 후의 num의 값 = " + num);
    }
}


// do-while 문
//public class Main {
//    public static void main(String[] args) {
//        int num = 1;
//        int sum = 0;
//
//        do {
//            sum += num;
//            num++;
//        } while (num <= 10);

//        System.out.println("1부터 10까지의 합 = " + sum);
//        System.out.println("while문이 끝난 후의 num의 값 = " + num);
//    }
//}
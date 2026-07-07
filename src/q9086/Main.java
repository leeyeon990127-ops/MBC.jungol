package q9086;

import java.util.Scanner;
public class Main {
    //평균을 계산하는 메서드 gatAverage
    public static double getAverage(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("세과목의 점수를 입력하세요.");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        double avg = getAverage(n1, n2, n3);

        System.out.printf("평균 : %.2f\n", avg);
    }
}

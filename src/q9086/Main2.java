package q9086;

import java.util.Scanner;

public class Main2 {
    public static double getAvg(int[] p) {
        int sum = 0;
        for(int i=0; i<p.length; i++) {
            System.out.println(p[i] + " ");
            sum += p[i];
        }
        return sum / (double) p.length;
    }

    public static void main(String[] args) {
        System.out.print("세 과목의 점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);

        int[] inp = new int[3];
        for(int i=0; i<inp.length; i++) {
            inp[i] = sc.nextInt();
        }
        sc.close();
        System.out.printf("평균: %.2f\n", getAvg(inp));
    }
}

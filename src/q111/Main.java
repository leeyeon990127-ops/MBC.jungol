package q111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        int score4 = sc.nextInt();

        int sum = score1 + score2 + score3 + score4;
        double avg = (double) sum / 4;      // 형변환

        System.out.println("sum" + " " + sum);
        System.out.print("avg" + " " + (int)avg);
    }
}

        /*
        for 문
        int[] score = new int[4];
        for (int i = 0; i<score.length; i++) {
            score[i] = sc.nextInt();
        }
        sc.close();

        향상된 for 문
        for(int p : score) {
            System.out.print(p + "")
        }

         */
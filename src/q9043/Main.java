package q9043;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true) {
            int num = sc.nextInt();

            if(num == 0) {  //0이 입력되면 종료
                break;
            }
            if(num % 2 == 1 ) { // 홀수인지 판별
                sum += num;
                count++;
            }
        }
        double avg = (double) sum / count;

        System.out.println("홀수의 합 = " + sum);
        System.out.printf("홀수의 평균 = " + (int)avg);

        sc.close();
    }
}

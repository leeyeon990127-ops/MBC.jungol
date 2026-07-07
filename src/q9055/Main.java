package q9055;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력받을 수, 누적합, 마지막 더해진 값
        int num = sc.nextInt();
        int sum = 0;
        int i = 0;

        while(true) {
            i++;
            sum += i;

            if(sum>num) {
                break;
            }
        }
        System.out.println(i + " " + sum);

        sc.close();
    }
}
/*
for문
int sum = 0;
int i = 1;
for(int i=0; ; i++){
    sum += i;
    if(sum>num) break;
}

 */
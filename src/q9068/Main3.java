package q9068;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int i = 0;
        for (; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) break;
        }
        sc.close();

        for(int j=0; j< i; j++) {
            if(j%2 == 1) {
                System.out.println(arr[j] + " ");
            }
        }
    }
}
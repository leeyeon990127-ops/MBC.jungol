package q9068;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[1] + " " + arr[3] + " " + arr[5] + " " + arr[7]);
        sc.close();
    }
}



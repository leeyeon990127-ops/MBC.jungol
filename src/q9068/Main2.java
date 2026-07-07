package q9068;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        for(int i = 0; i<100; i++) {
            int inp = sc.nextInt();
            if(inp == 0) {
                break;
            }
            arr[i] = inp;
            count++;
        }
        for(int i = 0; i<count; i += 2) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}

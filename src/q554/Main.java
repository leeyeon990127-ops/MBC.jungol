package q554;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        char alpha = 'A';

        //행
        for(int i =0; i<n; i++) {
            //열
            for(int j = 0; j<n-i; j++) { //숫자
                System.out.print(num++ + " ");
            }

            for(int j =0; j<i+1; j++) {    //알파벳
                System.out.print(alpha++ + " ");

            }
        }
        System.out.println();
    }
}


//         for(int i = 0; i<n;i++) {
//              for(int j=0; j<n; j++) {
//                  if(j < n-i) {
//                      System.out.print(num++ + " ");
//                  } else {
//                      System.out.print(alpha++ + " ");
//                  }
//              }
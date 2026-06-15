package q9066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] ar = new char[26];
        char ch = 'A';

        for (int i = 0; i < ar.length; i++) {
            ar[i] = ch++;
        }
        for(int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }

        for(int i = 25; i>=0; i--) {
            System.out.print(ar[i] + " ");
        }
    }
}

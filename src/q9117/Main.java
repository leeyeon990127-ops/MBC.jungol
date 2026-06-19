package q9117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        sc.close();

        for(int i = 0; i <str.length(); i++) {
            String first = str.substring(0, 1); //(시작, 끝까지 다 가져와)
            String rest = str.substring(1); //(시작 인덱스 부터 다 가져와)
            str = rest + first;
            System.out.println(str);
        }
    }
}

package q9121;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] words = {"champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"};
        Scanner sc = new Scanner(System.in);

        //입력받기
        System.out.println("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);
        sc.close();

        for(int i = 0; i<words.length; i++){
            if(ch == words[i].charAt(0)) {
                System.out.println(words[i]);
            }
        }
    }
}

package q9041;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score > 100) {
                continue;
            }
            if (score > 80) {
                System.out.println("축하합니다. 합격입니다. ");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }

        }
        sc.close();
    }
}

package q9069;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //각 월의 일수를 배열로 저장
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true) {
            System.out.print("YEAR = ");
            int year = sc.nextInt();
            System.out.print("MONTH = ");
            int month = sc.nextInt();

            if(year == 0) {
                break;
            }
            if(month <1 || month > 12) {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
                continue;
            }

            //날짜 계산
            int dayCount = days[month];

            //2월 이면서 윤년인 경우
            //(year % 4 == 0 && year % 100 != 0) :4의 배수이면서 100의 배수가 아닌 해는 윤년
            // ||연산자 :'또는'. 앞 조건이 참이거나 뒤 조건이 참이면 윤년
            // (year % 400 == 0) :400의 배수인 해는 무조건 윤년
            if(month == 2 &&((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                dayCount = 29;
            }
            System.out.println("입력하신 달의 날 수는 " + dayCount + "일입니다. ");
            System.out.println();
        }

        sc.close();

    }
}

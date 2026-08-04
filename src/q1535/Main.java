package q1535;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 중복 없이 입력된 순서대로 단어를 저장하기 위한 리스트
        // **선언하기* String 타입의 데이터를 담을 리스트 생성
        ArrayList<String> wordList = new ArrayList<>();

        //종료조건 처리와 반복입력 구조
        while(true) {
            String str = sc.nextLine();

            if(str.equals("END")) {
                break;
            }

            //문장을 단어 단위로 쪼개기
            String[] words = str.split(" ");

            for (String word : words) {
                //현재 단어 목록(wordList)에 이 단어가 포함되어 있지 않으면
                if(!wordList.contains(word)) {
                    wordList.add(word); // **목록의 가장 뒤에 추가
                }
            }
        }
        for(int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
            if(i < wordList.size() -1) {
                System.out.println(" ");    //마지막 단어가 아니면 공백 출력
            }
        }
    }
}

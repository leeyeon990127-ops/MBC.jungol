package q199;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

//구조체
class Student{
    String name;
    int score1;
    int score2;
    int score3;
    int sum;

//객체 생성시 입력받을 값을 변수에 저장하는 생성자 함수
    public Student(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.sum = score1 + score2 + score3;
    }

    public void print() {
        System.out.println(name + " " + score1 + " " + score2 + " " + score3 + sum);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] stu = new Student[n];

        //n번 반복해서 이름과 세 과목 점수를 각각 s1, s2, s3 변수에 받는다
        for(int i =0; i<n; i++) {
            String name = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            //읽어온 값들을 사용하여 Student 객체를 생성하고 배열의 i번째 칸에 넣습니다.
            stu[i] = new Student(name, s1, s2, s3);
        }

        //오름차순(사전순) 정렬
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        //결과 출력
        for(int i =0; i <stu.length; i++) {
            System.out.println(stu[i].name + " " + stu[i].score1 + " " + stu[i].score2 + " " + stu[i].score3);
        }

        sc.close();
    }
}

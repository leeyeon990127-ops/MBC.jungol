package q614;

import java.util.Scanner;

class School {
    String name;
    int grade;

    public School(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        School s1 = new School("Jejuelementary", 6);  //첫번째 객체 생성(고정값)

        String inputName = sc.next();
        int inputGrade = sc.nextInt();
        School s2 = new School(inputName, inputGrade);

        System.out.println(s1.grade + " grade in " + s1.name + "School");
        System.out.println(s2.grade + " grade in " + s2.name + "School");

        sc.close();

    }
}
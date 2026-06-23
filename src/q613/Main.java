package q613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();
        sc.close();

        System.out.println(name + " " + school + " " +grade);
    }
}

class Student {
    private String name;
    private String school;
    private int grade;

    public Student(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public void print() {
        System.out.println("Name : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);
    }
}

/*
import java.util.Scanner;

class Student {
    String name;
    String school;
    int grade;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 설계도를 바탕으로 정보 저장용 박스 생성
        Student s = new Student();

        // 입력받아 저장
        s.name = sc.next();
        s.school = sc.next();
        s.grade = sc.nextInt();

        // 출력 (문제에서 요구하는 형식대로!)
        System.out.println("Name : " + s.name);
        System.out.println("School : " + s.school);
        System.out.println("Grade : " + s.grade);

        sc.close();
    }
}

 */
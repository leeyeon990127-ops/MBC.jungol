package q615;

import java.util.Scanner;

class Student {
    String name;
    int lan;
    int eng;

    public Student(String name, int lan, int eng) {
        this.name = name;
        this.lan = lan;
        this.eng = eng;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student("Junho", 88, 100);

        String inputName = sc.next();
        int inputLan = sc.nextInt();
        int inputEng = sc.nextInt();
        Student st2 = new Student(inputName, inputLan, inputEng);

        //각 학생의 정보 출력
        System.out.println(st1.name + " " + st1.lan + " " + st1.eng);
        System.out.println(st2.name + " " + st2.lan + " " + st2.eng);

        //평균계산
        int avgLan = (st1.lan + st2.lan) / 2;
        int avgEng = (st1.eng + st2.eng) / 2;

        System.out.println("avg" + " " + avgLan + " " + avgEng);

        sc.close();
    }
}

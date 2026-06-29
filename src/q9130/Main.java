package q9130;

import java.util.Scanner;

// <클래스X는 문제풀이>
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String name;
//        int age;
//
//        System.out.println("당신의 이름은 무엇입니까? ");
//        name = sc.next();
//
//        System.out.println("당신의 나이는 몇 살입니까? ");
//        age = sc.nextInt();
//
//        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세이시군요.") ;
//
//        sc.close();
//    }
//}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("당신의 이름은 " + name + "이고 나이는" + age + "세이군요.");
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Person[] arr = new Person[3];

        for(int i =0; i<3; i++) {
            System.out.print("당신의 이름은 무엇입니까? ");
            String name = sc.next();
            System.out.print("당신의 나이는 몇 살입니까? ");
            int age = sc.nextInt();

            arr[i] = new Person(name, age);
        }

        for(int j = 0; j <3; j++) {
            System.out.println("당신의 이름은 " + arr[j].name + "이고 나이는 " + arr[j].age + "세이군요.");
            //arr[j].print();
        }
//
//        System.out.print("당신의 이름은 무엇입니까? ");
//        String name = sc.next();
//
//        System.out.print("당신의 나이는 몇 살입니까? ");
//        int age = sc.nextInt();
//
//        //클래스를 활용해 객체 생성
//        Person p = new Person(name, age);


          // 객체의 정보를 사용하여 출력
//        System.out.println("\n당신의 이름은 " + p.name + "이고 나이는 " + p.age + "세이군요.");

        sc.close();
    }
}


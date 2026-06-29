package q9136;

import java.util.Scanner;

class Person{
    String name ;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] arr = new Person[5] ;

        for(int i = 0; i<5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            //생성자를 통해 배열에 객체 넣어주기
            arr[i] = new Person(name, height, weight);
//            System.out.println(name + " " + height + " " + weight);
        }
        sc. close();

        //키가 작은 순으로(오름차순)으로 정렬하기.-버블소트
        for(int i = 0; i<5-1; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (arr[j].height > arr[j + 1].height) {
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i<5; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }
    }
}

//막혔던부분; 생성자를 통해 객체 넣기, 버블소트



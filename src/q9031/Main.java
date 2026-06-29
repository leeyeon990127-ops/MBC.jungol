package q9031;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("입력받은 수 중 큰 수는 " + num1 + "이고 작은 수는 " + num2 + "입니다.");
        } else {
            System.out.println("입력받은 수 중 큰 수는 " + num2 + "이고 작은 수는 " + num1 + "입니다.");
        }
        sc.close();
    }
}
*/

        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();

        if(arr[0] < arr[1]) {
            int temp = arr[0];  //임시 변수 temp에 arr[0]의 값을 잠시 넣음
            arr[0] = arr[1];
            arr[1] = temp;  //빈 arr[1]에 아까 보관해둔 값 넣음
        }
            System.out.println("입력받은 수 중 큰 수는 " + arr[0] + "이고 작은 수는 " + arr[1] + "입니다.");

        }
    }
}

//      int max = Math.max(num1, num2);
//      int min = Math.min(num1, num2);

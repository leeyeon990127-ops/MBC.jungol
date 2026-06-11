package q506;

public class Main {
    public static void main(String[] args) {
        int var1 = 170;
        String var2 = "68.600000";

        System.out.println("My height");
        System.out.println(var1);
        System.out.println("My weight");
        System.out.println(var2);
    }
}
//double var2 = 68.600000
//System.out.printf("%.6f\n", var2);

//printf()를 쓸 때 필수 성분 : %, 데이터 종류

//% (신호탄): "자바야, 이제부터 내가 출력 형식을 알려줄 테니 준비해!"라는 시작 신호입니다.
//.6 (소수점 자릿수): "소수점 아래 6자리까지 무조건 채워서 보여줘"라는 뜻입니다. (값이 68.6처럼 짧아도 남은 자리를 0으로 채워서 68.600000으로 만들어 줍니다.)
//f (데이터 종류): Float의 앞 글자로, "출력할 데이터는 소수점이 있는 실수야"라고 알려주는 것입니다.
//\n (줄바꿈): 출력을 다 하고 나서 엔터(줄바꿈)를 한 번 쳐달라는 특수 문자입니다. (println은 자동으로 줄을 바꿔주지만, printf는 이 \n을 직접 적어주어야 줄이 바뀝니다.)


//public class Main {
//    public static void main(String[] args) {
//        int height = 170;
//        double weight = 68.600000;
//        System.out.print("My height\n" + height + "\nMy weight\n");
//        System.out.printf("%.6f\n", weight);
//    }
//}
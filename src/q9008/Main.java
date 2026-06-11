package q9008;

public class Main {
    public static void main(String[] args) {
//        System.out.println(" subject score");
//        System.out.println("==============");
//        System.out.println("  korean    90");
//        System.out.println(" english   100");
//        System.out.print("computer    80");
//    }
//}

        int a = 90;
        int b = 100;
//        int c = 80;

        System.out.println(" subject score");
        System.out.println("==============");
        System.out.println("  Korean    " + a);
        System.out.printf(" english   "+"%d\n", b);
        System.out.printf("%8s   %3d\n", "computer", 80);

    }
}

//        for (int i = 0; i < subjects.length; i++) {
//            System.out.printf("%8s %5d\n", subjects[i], scores[i]);
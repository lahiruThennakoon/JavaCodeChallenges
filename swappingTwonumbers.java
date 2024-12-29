public class swappingTwonumbers {

    // Logic 1

    public static void swapMethod1() {// 3rd variable

        int a = 10, b = 20;

        int c = a;
        a = b;
        b = c;

        System.out.println("after swapping a=" + a + " b=" + b);

    }

    public static void swapMethod2() {// using + and - operators

        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping a=" + a + " b=" + b);

    }

    public static void swapMethod3() {// using * and / operators

        int a = 10, b = 20;
        a = a * b;
        b = a/b;
        a = a/b;
        System.out.println("after swapping a=" + a + " b=" + b);

    }

    public static void main(String[] args) {

        swapMethod1();
        swapMethod2();
        swapMethod3();

    }

}
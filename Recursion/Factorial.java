package Recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(0));
    }

    public static int factorial(int n){
        int result;
        if (n<=1){

            return 1;
        }
        else {result = n*factorial(n-1);}

return result;
    }
}

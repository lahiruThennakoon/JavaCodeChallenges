package Recursion;

public class SumOfArray {

    static int[] array ={1,3,4,5,7,9};

    public static void main(String[] args) {

        System.out.println( sumOfDigits(array.length-1));

    }

    private static int sumOfDigits(int n) {
        if (n==0){
            return array[n];
        }
        else return array[n]+sumOfDigits(n-1);
    }
}

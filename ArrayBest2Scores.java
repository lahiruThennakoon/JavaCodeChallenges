// Given an array, write a function to get first, second best scores from the array and return it in new array.

// Array may contain duplicates.
// myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
// firstSecond(myArray) // {90, 87}

import java.util.Arrays;

public class ArrayBest2Scores {
    public static void main(String[] args) {
       int [] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

        Arrays.toString(findTopTwoScores(myArray));
    }
    public static int[] findTopTwoScores(int[] array) {
        int max1 = 0;
        int max2 = 0;
        int[] result = new int[2];

        for (int i = 0; i < array.length; i++) {

            if (max1 < array[i]) {

                max1 = array[i];
            }

        }

        for (int i = 0; i < array.length; i++) {
            if (max2 < array[i] && array[i] != max1) {

                max2 = array[i];
            }

        }
        result[0] = max1;
        result[1] = max2;
        return result;
    }

}

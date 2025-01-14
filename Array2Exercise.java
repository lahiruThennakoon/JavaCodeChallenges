// Given 2D array calculate the sum of diagonal elements.

// Example

// myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
// sumDiagonalElements(myArray2D) # 15

public class Array2Exercise {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 4, 5, 6, 5 },
                { 7, 8, 9, 6 },
                { 7, 8, 9, 6 }
        };

        sumDiagonalElements(matrix);

    }

    public static int sumDiagonalElements(int[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i == j) {

                    System.out.println(array[i][j]);
                    sum = sum + array[i][j];

                }

            }

        }
        return sum;
    }
}

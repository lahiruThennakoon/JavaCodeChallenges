package Array;
// Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

// myArray = [1, 2, 3, 4]
// middle(myArray)  # [2,3]. 

public class Array1Exercise {

public static void main(String[] args) {
 int []array1 ={1,2,3,4,5}; 
    
    System.out.print("Array elements: ");
        for (int element : middle(array1)) {
            System.out.print(element + " ");}

}
    public static int[] middle(int[] array) {
        int[] middle = new int [array.length-2];
        
        for (int i=1;i< array.length-1;i++){
            if(i==0||i==array.length-1){
                System.out.println("skipping 1st and last elements");
            }
            else{middle[i-1]=array[i];}
        }
        return middle;
    }

}
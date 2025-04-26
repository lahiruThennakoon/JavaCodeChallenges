package StarPattern;

public class StarPattern1 {
    /*
     *
     ***
     *****
     *******
     **********/;

    public static void main(String[] args) {
        printStars2(4);

    }

    //My solution
    public static void printStars(int lines) {

        int k = 0;
        for (int i = 0; i <= lines; i++) {

            int j = 0;
            while (k > j) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            k = (i*2)+1;
        }
    }
    //teacher's solution
    public static void printStars2(int lines) {

        int k = 1;
        for (int i = 1; i <=lines; i++) {

            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            System.out.println();
            k = k+2;
        }
    }
}

import java.util.Arrays;

public class multidimensional {
    public static void main(String[] args) {
        int[][] arr=new int [3][];

        int [][] arr2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(arr2.length);
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col]+" ");
            }

        }




    }

}

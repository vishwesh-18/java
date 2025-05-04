package com.linear;

import java.sql.Array;
import java.util.Arrays;

public class SearchIn2Darr {
    public static void main(String[] args) {
        int [][] arr={
                {65,34,45},
                {54,64,35,65},
                {23,65,34,98},
        };
       int[] ans = search(arr,45);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int [][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
      int element = arr[row][col];

      if(element==target){
          return new int[]{row,col};
      }
            }

        }
        return new int[]{-1,-1};
    }


}


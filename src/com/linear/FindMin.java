package com.linear;

public class FindMin {
    public  static  void  main(String args[]){
       int[] arr = {14,23,45,65,65,65,23,45,4,5,3,76,45,};
        System.out.println(findmin(arr));

    }
    static  int findmin(int[]  arr ){
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

package com.linear;

public class SearchInRange {
    public  static  void main(String args[]){
        int[] arr = {14,54,5,4,45,66,43,75,65,65};
        int target = 45;
        int start =1;
        int end = 5;
        System.out.println(linearSearch(arr,target,start,end));


    }
    static int linearSearch(int [] arr,int target, int start , int end){
        if(arr.length==0){
            return  -1;
        }

        for(int i = start; i<=end;i++){
//            System.out.println(arr[i]);
         if(arr[i]==target){
             return  i;
         }
        }

        return -1;
    }
}

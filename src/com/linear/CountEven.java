package com.linear;

public class CountEven {
    public static void main(String[] args) {
        int[] nums ={12,3245,2,26,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            int digits=noOfDigits(nums[i]);
            if(even(digits)){
                count++;
            }
        }
        return count;
    }

    static  boolean even(int num){
        if(num%2==0){
            return  true;
        }
        return  false;
    }
    static  int noOfDigits(int num){
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }

}





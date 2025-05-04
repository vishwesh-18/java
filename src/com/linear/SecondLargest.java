package com.linear;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = secondLargest(arr);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
    static  int secondLargest(int []arr ){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return  secondLargest;
    }
}

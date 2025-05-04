package com.linear;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 1}
        };

        System.out.println(maxWealth(accounts));
    }

    static  int maxWealth(int[][] accounts) {
        int max=0;
        for (int person = 0; person < accounts.length; person++) {
            int rowSum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum+= accounts[person][account];
            }
            if(rowSum>max){
                max=rowSum;
            }

        }
return  max;
    }
}

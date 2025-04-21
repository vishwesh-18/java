public class EvenDigit {
    public static void main(String[] args) {

        int [] arr= {12,3,454,4,5555,6434,5555,};
       int count = findnumbers(arr);
        System.out.println(count);
    }

    static  int findnumbers(int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
          if(even(arr[i])){
              count++;
          }
        }
return  count;
    }

    static boolean even(int num){
int ditigs =digits(num);

if(ditigs%2==0) return  true;

        return  false;
    }

    static  int digits(int num){
        int count = 0;
        while (num>0){
            count++;
            num=num/10;

        }
        return  count;
    }
}


public  class PrimeCheck {
    public static  boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2){
            return  true;
        }
        if(num%2==0){
            return  false;
        }

        for(int i =3; i * i <= num;i=i+2){
            if(num%i==0){
                return false;
            }

        }        return true;
    }


    public static void main(String[] args) {
        int num=97;
        System.out.println(isPrime(num));
            }
}







































//public class PrimeCheck {
//
//    public static boolean isPrime(int num) {
//        if (num < 2) {
//            return false;
//        }
//
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int number = 29;
//        if (isPrime(number)) {
//            System.out.println(number + " prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
//    }
//}

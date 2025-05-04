


public  class BinarySearch{
    public  static  int binarySearch(int [] arr,int target){
        int start = 0; int end = arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,};

        System.out.println(binarySearch(arr,4));
    }
}































//
//
//public class BinarySearch {
//    public static void main(String[] args) {
//        int[]arr ={1,2,3,4,5,6,7,8,9,};
//
//        int ans = binarySearch(arr,1);
//        System.out.println(ans);
//    }
//
//    static  int binarySearch(int [] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//            } else if(target>arr[mid]){
//                start=mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return  -1;
//    }
//}

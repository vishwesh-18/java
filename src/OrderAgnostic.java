public class OrderAgnostic {
    public static void main(String[] args) {
      //  int[]arr ={1,2,3,4,5,6,7,8,9,};
        int[] arr={9,8,7,6,5,4,3,2,1};
        int target =7;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }
    static  int orderAgnostic(int [] arr,int target){
int start =0;
int end = arr.length-1;
boolean isAsc;
// find the array is sorted in acceding or descending order
        if(arr[start]<arr[end]){
            isAsc=true;
        }else {
            isAsc=false;
        }

while (start<=end){
    int mid =start+(end-start)/2;

    if(target==arr[mid]){
        return mid;
    }

    if(isAsc){
        if(target>arr[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }else {
        if(target<arr[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }




}
return -1;
    }
}

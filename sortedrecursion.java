public class sortedrecursion {
    public static boolean issorted(int arr[],int idx){
       if(idx == arr.length-1){//not undertand
        return true;
       }
       
        if(arr[idx]<arr[idx+1]){
           return issorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5};
        System.out.println(issorted(arr,0));
    }
}

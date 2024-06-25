public class CheckSortedArray {
    public static boolean Sorted(int arr[]){
        for(int i=1;i< arr.length;i++){
            if(arr[i-1]<arr[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,22};
        System.out.println(Sorted(arr));
        int arr2[]={1,2,1,3,5,22};
        System.out.println(Sorted(arr2));
    }
}

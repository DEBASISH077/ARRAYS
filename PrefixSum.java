public class PrefixSum {
    public static void prefixSum(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            temp=temp+arr[i];
            arr[i]=temp;
        }

    }
    //WITHOUT TEMP VARIABLE
//     for(int i=1;i<arr.length;i++){
//        arr[i]+=arr[i-1];
//    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        prefixSum(arr);
        print(arr);
            }
}

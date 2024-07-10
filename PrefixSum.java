public class PrefixSum {
<<<<<<< HEAD
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
=======
    public static void main(String[] args) {
        System.out.println("HELLO");
    }
>>>>>>> 9349b93a1f73961fb0f886e9d713d6decb0d85e3
}

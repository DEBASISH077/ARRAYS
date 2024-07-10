public class CheckEqualsOfPrefixAndSuffixSumSubarray {
    public static void findSum(int arr[]){
        int totalsum=0;
        for(int i=0;i< arr.length;i++){
            totalsum=totalsum+arr[i];
        }
        System.out.println(checkPrefixAndSuffixSum(arr,totalsum));
    }
    public static boolean checkPrefixAndSuffixSum(int arr[],int totalsum){
        int prefixsum=0;

        for(int i=0;i<arr.length;i++){
            prefixsum=prefixsum+arr[i];
           int suffixsum=totalsum-prefixsum;
           if(suffixsum==prefixsum){
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,5,6,7};
        findSum(arr);
    }
}

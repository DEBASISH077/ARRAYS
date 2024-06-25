public class LastOccuranceOfANumber {
    public static int lastOccurance(int arr[],int x){
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,3,2,2,2,5,8,9};
        System.out.println(lastOccurance(arr,2));
    }
}

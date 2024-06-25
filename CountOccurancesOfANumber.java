public class CountOccurancesOfANumber {
    public static int returnCount(int arr[],int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,3,2,2,2,5,8,9};
        System.out.println(returnCount(arr,2));
    }
}

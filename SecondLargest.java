public class SecondLargest {
    public static int secondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondLarge=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest) {
                largest=arr[i];
            }
        }
       
        for(int i=0;i<arr.length;i++){

            if (arr[i]>secondLarge) {
                secondLarge=arr[i];
            }
        }
return  secondLarge;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 3, 4};
        System.out.println(secondLargest(arr));
    }
}

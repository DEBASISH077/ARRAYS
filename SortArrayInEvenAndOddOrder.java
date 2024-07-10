public class SortArrayInEvenAndOddOrder {
    public static void sortArrayOfEvenAndOdd(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if (arr[left]%2!=0 && arr[right]%2==0) {
                swap(arr,left,right);
                left++;
                right--;
                
            }
            if (arr[left]%2==0) {
                left++;
            }
            if (arr[right]%2!=0) {
                right--;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]%2==0 && arr[j]%2==0 && arr[i]>arr[j]) {
                    swap(arr, i, j);
                }
                if(arr[i]%2!=0 && arr[j]%2!=0 && arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
           
        }
    }
    public static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,6,10,2,13,7,8};
        sortArrayOfEvenAndOdd(arr);
        print(arr);
    }
}

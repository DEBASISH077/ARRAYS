public class ReverseAnArray {
    public static void reverse(int arr[]){
swap(arr, 0, arr.length-1);

    }
    public static void swap(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i] ;
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[]={9,8,7,6,5};
        reverse(arr1);
        print(arr1);
       
    }
}

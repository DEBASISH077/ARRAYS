public class SwappingAnArrayWithAnotherArray{
    public static void  swappingArray(int arr1[],int arr2[]){
        if (arr1.length==arr2.length) {
            swap(arr1, arr2);
            
        }
        

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr1[],int arr2[]){
        int temp=0;
       for(int i=0;i<arr1.length;i++){
        temp=arr1[i];
        arr1[i]=arr2[i];
        arr2[i]=temp;
       }
    }
    public static void main(String[] args) {
        int arr1[]={9,8,7,6,5};
        int arr2[]={0,1,2,3,4};
        swappingArray(arr1, arr2);
        print(arr1);
        System.out.println("------------------------------------------------");
        print(arr2);
    }
}
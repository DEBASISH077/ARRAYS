public class AdditionOfMatrices {
    public static void   add(int arr1[][],int arr2[][]){

        int result[][]=new int[arr1.length][arr1.length];
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        printarr(result);

    }
    public static void printarr(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        if(arr1.length==arr2.length){
            add(arr1,arr2);
        }
        else {
            System.out.println("NOT POSSIBLE");
        }
    }
}

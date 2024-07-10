public class TwoDimensionalArray {
    public static void printarr(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //EXAMPLE
        int[][] arr=new int[2][2];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=i+j;
            }
        }
        int arr2[][]={{1,2},{3,4}};
        printarr(arr);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("BY USING ARRAY LITERALS");
        printarr(arr2);
    }
}

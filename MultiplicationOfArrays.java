public class MultiplicationOfArrays {
    public static void multiply(int arr1[][],int arr2[][],int row1,int column1,int row2,int column2){
        int result[][]=new int[row1][column2];
        int sum=0;
        if(column1==row1){
            for(int i=0;i<row1;i++){
                for(int j=0;j<column2;j++){
                    for(int k=0;k<column1;k++){

                        result[i][j]+=arr1[i][k]*arr2[k][j];
                    }

                }
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
            multiply(arr1,arr2,3,3,3,3);
        }
        else {
            System.out.println("NOT POSSIBLE");
        }

    }
}

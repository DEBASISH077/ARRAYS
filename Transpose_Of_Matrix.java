public class Transpose_Of_Matrix {
    public static void transpose(int arr1[][],int row,int column){

        for(int i=0;i<column;i++){
            for (int j=i ;j<row;j++){

                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;

            }
        }
    }
    public static void printarr(int arr1[][]){
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1.length;j++) {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        transpose(arr1,3,4);
        printarr(arr1);
    }
}

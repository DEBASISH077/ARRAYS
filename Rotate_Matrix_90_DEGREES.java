public class Rotate_Matrix_90_DEGREES {
    public static void transpose(int arr1[][],int row,int column){

        for(int i=0;i<column;i++){
            for (int j=i ;j<row;j++){

                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;

            }
        }
    }
    public static void reverseArray(int arr[]){
        int i=0;
        int k=arr.length-1;
        while(i<k){
           int temp=arr[i];
           arr[i]=arr[k];
           arr[k]=temp;
            i++;
            k--;
        }

    }

    public static void rotate(int arr[][],int n){
        transpose(arr,3,3);
        for(int i=0;i<n;i++){
            reverseArray(arr[i]);
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
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr1,3);
        printarr(arr1);
    }
}

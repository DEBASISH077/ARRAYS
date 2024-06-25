import javax.sound.midi.spi.SoundbankReader;
import java.sql.SQLOutput;

public class Introduction {
    public static void main(String[] args) {
     //   CREATION OF ARRAY
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        //PRINTING OF THE ARRAY
        System.out.println("ARRAY USING LOOP");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        //TRAVERSING USING FOR EACH LOOP
        System.out.println("PRINTING ARRAY  USING FOR EACH LOOP");
        for(int arrname:arr){
            System.out.println(arrname);

        }

        System.out.println("----------------------------------------------------------------------------------------");
        //ARRAY CREATION USING ARRAY LITERAL
        int[] arr2={1,2,3,4,5,6};
        //PRINTING THE ARRAY
        System.out.println("PRINTING THE ARRAY LITERAL");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------");

        //2D ARRAY
        int [][] arr2d=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j< 2;j++){
                arr2d[i][j]=i;
            }
        }
        System.out.println("PRINTING THE 2D ARRAY ");
        for(int i=0;i< arr2d.length;i++){
            for(int j=0;j< arr2d.length;j++){
                System.out.println(arr2d[i][j]);
            }

        }
        System.out.println("------------------------------------");
        //USING ARRAY LITERAL
        int [][] arr3={{1,2},{2,4},{5,6}};
        System.out.println("PRINTING THE 2D ARRAY LITERAL");
        for(int k=0;k<3;k++){
            for(int m=0;m<2;m++){
                System.out.print(arr3[k][m]+" ");
            }
            System.out.println();
        }
    }
}

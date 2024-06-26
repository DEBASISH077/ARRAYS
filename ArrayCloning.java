import java.util.Arrays;

public class ArrayCloning {
    public static void main(String[] args) {
        int  arr1[]={1,2,4,5,7,6};
    for(int i=0;i<arr1.length;i++){
        System.out.println("ELEMENT AT INDEX "+i+" is "+arr1[i]);
    }
        System.out.println("------------------------------------------------------------------------------------------------------------------");

    //CLONING AN ARRAY WITHOUT CHANGING THE ELEMNTS OF THE MAIN ARRAY
    
        int arr3[]= new int[arr1.length];
        //OR int arr3[]=arr1.clone();
        //OR int arr3[]=Arrays.copyOfRange(arr1,0,arr1.length);
        arr3[0]=5;
        for(int i=0;i<arr3.length;i++){
            System.out.println("ELEMENT AT INDEX "+i+" is "+arr3[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<arr1.length;i++){
            System.out.println("ELEMENT AT INDEX "+i+" is "+arr1[i]);
        }
    }

}

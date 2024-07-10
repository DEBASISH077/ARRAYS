import java.util.*;
public class SearchAnElement {
    public static boolean found(int arr[],int element){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==element){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,65};
       // System.out.println(found(arr,1));
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ELEMENT FROM THE ARRAY");
        int element=sc.nextInt();
        if(found(arr,element)){
            System.out.println("YES FOUND");
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}

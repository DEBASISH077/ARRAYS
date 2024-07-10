//GIVEN A SORTED ARRAY IN NON DECREASING ORDER TO FIND THE SQUARES OF THE THE ARRAY ELEMENTS IN NON DECREASING ORDER
public class SortSquaresOfTheArray {
    public static void sortArray(int arr[]){
        int left=0;
        int rigth=arr.length-1;
        int k=arr.length-1;
        int ans[]=new int[arr.length];
        while(left<=rigth){
            if (Math.abs(arr[left])>Math.abs(arr[rigth])) {
                ans[k--]=arr[left]*arr[left];
                left++;
             
            }
            else{
               ans[k--]=arr[rigth]*arr[rigth]; 
               rigth--;
            }

        }
       // reverse(arr);
        print(ans);
        
    }
   
    
    public static void print(int arr[]){
       for(int m=0;m<arr.length;m++){
        System.out.println(arr[m]);
       }
    }
    public static void main(String[] args) {
        
            int arr[]={10,-3,-2,1,4,5};
            sortArray(arr);
            
    }
}

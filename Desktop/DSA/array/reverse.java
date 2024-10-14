
import java.util.Arrays;

class reverse{
    public static void main(String[] args) {
        int arr[]={12,3,4,5,3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[]) {
        int start =0;
        int end = arr.length-1;
        for(int i= start ; i<=end ; i++){
swap(arr, start, end);
start++;
end--;
        }
        
    }
    public static void swap(int arr[] , int index1 , int index2) {
      
      
            int temp= arr[index1];
            arr[index1]= arr[index2];
            arr[index2]=temp;
            
        }
        
    }

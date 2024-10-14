
import java.util.ArrayList;

public class uniontwo {

    public static ArrayList<Integer> checkkr( int arr[], int arr1[],int n, int m) {
        int i=0;
        int j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while ( i<n && j<m){
            if(arr[i]<=arr[j]){
                if( union.size() == 0 || union.get(union.size()-1) !=arr[i])
                    union.add(arr[i]);
                
                i++;
            }else{
                if( union.size()==0 || union.get(union.size()-1) !=arr1[j])
                    union.add(arr1[j]);
                
                j++;
            }
        }
            while(i<n){
                if(union.get(union.size()-1) !=arr[i])
                    union.add(arr[i]);
            
        i++;
        }
        while(j<m){
            if(union.get(union.size()-1) !=arr1[j])
                union.add(arr1[j]);
            
            j++;
        }
        
   
    return union;
}
 public static void main(String[] args) {
    int n = 10, m = 7;
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
   
ArrayList<Integer> Union = checkkr(arr, arr2, n, m);
  System.out.println("Union of arr1 and arr2 is ");
  for (int val: Union)
    System.out.print(val+" ");

 }   
}

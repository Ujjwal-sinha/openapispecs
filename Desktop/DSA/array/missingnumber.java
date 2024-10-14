public class missingnumber {

    public static int missing(int arr[], int n) {
      int xor1=0;
      int xor2=0;
      for( int i=0;i<n-1;i++){
        xor2 = xor2 ^ arr[i]; // array mein jitna element hai 1,2,4,5
        xor1= xor1 ^(i+1); // total number 1,2,3,4 
      }
        xor1= xor1 ^n; // 5 bhi 
        return (xor1^xor2);
        
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,4,5 };
        int miss= missing(arr, n);
        System.out.println(miss);
    }
}

public class linearsearch {

    public static int serclin(int arr[], int n, int k) {
for(int i=0; i<n;i++){
    if(arr[i]==k){
        return 1;
    }
}
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        int n= arr.length;
        int k=6;
      int ans=   serclin(arr, n, k);
System.out.println(ans);
    }
}

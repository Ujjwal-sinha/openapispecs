// package array;

public class max {
    public static void main(String[] args) {
        int arr[]= {12,45,67,888,90};

        int max= arr[0];
        for (int i=0; i<=arr.length-1;i++){
            if( arr[i]>max){
                max= arr[i];
            }

         
        }
        System.out.println(max);
    }
}

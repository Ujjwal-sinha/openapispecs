public class movezero {

    public static void chekcingzero (int arr[]) {
        int k=0;
        //  setting all the elements in the front nonzero!!
        for( int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
k++;
            }
        }
        for(int i=k; i< arr.length;i++){
            arr[i]=0;
        }
    }
 public static void main(String[] args) {
    int arr[]={1,0,1}; 
    chekcingzero(arr);
    for(int i=0; i<arr.length;i++){
    System.out.print(arr[i]+ " " );
    }
}   
}

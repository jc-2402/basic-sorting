//bubble sort
//larger elements swap with adj element
public class basicsorting1{
    public static void bubblesort(int arr[]){
        for(int turn =0 ; turn< arr.length-1; turn++){ //turn<= arr.length-2 .. 0th indexing
            // int swap =0;
             for(int j=0 ; j< arr.length-1-turn; j++){
                if( arr[j] > arr[j+1]){ //if curr is larger then swap with adjacent
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // swap++;
                }
             }
             
                // if(swap == 0){
                //     System.out.println("array was already");
                //     break;
                // }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
    }
}
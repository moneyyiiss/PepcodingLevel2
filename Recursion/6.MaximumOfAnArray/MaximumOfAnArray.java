import java.util.Scanner;

public class MaximumOfAnArray {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        //max in smaller array
        int misa = maxOfArray(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}

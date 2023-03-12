import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);
    }
    // Ex -> idx se end tak sab print kar de
    // Faith - > idx + 1 se end tak print karna janta hai
    public static void displayArr(int[]arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }
}

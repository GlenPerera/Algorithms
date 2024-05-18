package Practice2;

import java.sql.SQLOutput;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,3,5,68,0};
        System.out.println("Before Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }


        System.out.println("\nAfter Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

package AlgoPractice2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int lower = 0;
        int upper = arr.length  - 1;
        int mid = lower + (upper - lower) / 2;

        while (lower <= upper) {
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                lower = mid + 1;
            }else{
                upper = mid - 1;
            }




        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {12,3,4,56,78};
        int key = 56;
        System.out.println(binarySearch(arr, key));
    }
}

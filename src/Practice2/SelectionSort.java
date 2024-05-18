package Practice2;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {6,5,2,8,9,4};
        int minIndex = -1;
        System.out.println("Before Sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }


        for(int i=0; i<nums.length-1; i++){
            minIndex = i;
            for(int j=i+1; j<nums.length; j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }

                int temp = nums[minIndex];
                nums[minIndex] = nums[j];
                nums[j] = temp;

            }
        }




        System.out.println("After Sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}

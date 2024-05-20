package Practice3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {6,7,3,2,1,0};
        System.out.println("Before Sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }


        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - i - 1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }

    }
}

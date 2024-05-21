package AlgoPractice2;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {12,0,22,20,1};
        System.out.println("Before sorting:");
        for(int num : nums){
            System.out.print(num + " ");
        }


        for (int i=0; i<nums.length-1; i++){
            int minindex = i;
            for (int j=i+1; j<nums.length; j++){
                if(nums[j] < nums[minindex]){
                    minindex = j;

                }
            }
            int temp = nums[i];
            nums[i] = nums[minindex];
            nums[minindex] = temp;
        }


        System.out.println();
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

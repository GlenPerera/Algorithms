package Practice3;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {2,1,3,9,10,4};

        System.out.println("Before sorting:");
        for(int num:  nums){
            System.out.print(num+" ");
        }

        for (int i=0; i<nums.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }


            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }


        System.out.println();
        System.out.println("After sorting:");
        for(int num:  nums){
            System.out.print(num+" ");
        }
    }
}

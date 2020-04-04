package leetcode;

public class SortArray {
    public static void sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    public static void quickSort(int[] nums, int low, int high) {
        int i = low, j = high;
        if(i < j) {
            int flag = nums[i];
            while(i < j) {
                while(nums[j] >= flag && i < j) {
                    j--;
                }
                if(i < j) {
                    nums[i] = nums[j];
                    i++;
                }
                while(nums[i] < flag && i < j) {
                    i++;
                }
                if(i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }
            nums[i] = flag;
            quickSort(nums, low, i - 1);
            quickSort(nums, i + 1, high);
        }
//        System.out.print("quick sort: ");
//        print(nums);
    }

    public static void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("bubble Sort: ");
        print(nums);
    }


    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,6,7,10,3,8,9,1};
        System.out.print("init: ");
        print(arr);
        sortArray(arr);
    }
}

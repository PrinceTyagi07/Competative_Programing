// leetcode prblm-35 
import java.util.Arrays;

public class insert {
   
        public static int searchInsert(int[] nums, int target) {
           int left =0;
           int right=nums.length-1;
           while(left<=right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                right=mid-1;
            }
            if(target>nums[mid]){
                left=mid+1;
            }
    
           }
           return left;
        }
        public static void main(String[] args) {
        // Insert solution = new Insert();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Index to insert " + target1 + " in " + Arrays.toString(nums1) + ": " + searchInsert(nums1, target1));

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Index to insert " + target2 + " in " + Arrays.toString(nums2) + ": " + searchInsert(nums2, target2));

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Index to insert " + target3 + " in " + Arrays.toString(nums3) + ": " + searchInsert(nums3, target3));
    }
    }


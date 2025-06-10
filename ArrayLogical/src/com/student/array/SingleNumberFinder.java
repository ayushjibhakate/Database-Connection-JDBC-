package com.student.array;




public class SingleNumberFinder {
	
	
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
         
        System.out.println("Single Number (Example 1): " + findSingleNumber(nums1));
          System.out.println("Single Number (Example 2): " + findSingleNumber(nums2));
          System.out.println("Single Number (Example 2): " + findSingleNumber(nums3));
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        
        // XOR-ing all elements cancels out duplicates
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }
}
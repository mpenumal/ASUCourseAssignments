/*
Problem taken from Leetcode.

Given a non-empty array (named "nums") of non-negative integers, 
the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of "nums", 
that has the same degree as "nums".

TODO: Complete the findShortestSubArray function. 
	  You can use any of the java default libraries. 
	  Do not change the main method or class name.

Example 1:
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: [1,2,2,3,1,4,2]
Output: 6
*/
public class DegreeOfArray {
    // Complete this function
	public static int findShortestSubArray(int[] nums) {
		
		// return a valid subArrayLength
		return -1;
    }
	
	public static void main(String args[]) {
		// test 1
		int subArrayLength1 = -1;
		int nums1[] = {12,12,3,3,12,3,17,12,17,5,17,5,17};
		subArrayLength1 = findShortestSubArray(nums1);
		System.out.println(subArrayLength1);
		
		// test 2
		int subArrayLength2 = -1;
		int nums2[] = {1,1,2,1,2,3,1,2,3,4,5,4,3,2,1,2,3,4,5};
		subArrayLength2 = findShortestSubArray(nums2);
		System.out.println(subArrayLength2);
		
		// test 3
		int subArrayLength3 = -1;
		int nums3[] = {1,2,2,1,3,4,4,3,3,4,4,3,1,2,2,1};
		subArrayLength3 = findShortestSubArray(nums3);
		System.out.println(subArrayLength3);		

		// test 4
		int subArrayLength4 = -1;
		int nums4[] = {415,514,451,154,145,541,154,145,415,451,541,514};
		subArrayLength4 = findShortestSubArray(nums4);
		System.out.println(subArrayLength4);
		
		// test 5
		int subArrayLength5 = -1;
		int nums5[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,6,6,7,6,7,7,7,7,7,7};
		subArrayLength5 = findShortestSubArray(nums5);
		System.out.println(subArrayLength5);
		
		// test 6
		int subArrayLength6 = -1;
		int nums6[] = {1,2,2,3,4,4,4,4,5,6,6,6,6,6,7,8,9,10,1,2,3,4,5};
		subArrayLength6 = findShortestSubArray(nums6);
		System.out.println(subArrayLength6);
	}
}
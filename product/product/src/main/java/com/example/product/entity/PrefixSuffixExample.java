package com.example.product.entity;

public class PrefixSuffixExample {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int time = 4;
		
		for (int i = 1; i < nums.length; i ++) {
			nums[i] = nums[i] * nums[i - 1];
			//System.out.println(nums[i]); // 2, 6 ,24
		}
		
		for (int a = 0; a < time; a++) {
			System.out.println(nums[a]);
		}
		
		

	}

}

package runningSumOfOnedArray;

public class Main {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		System.out.println(runningSum(nums));

	}
	 public static int[] runningSum(int[] nums) {
//		    int i = 0;
//	        int arrLength = nums.length;
//	        int[] arr = new int[arrLength];
//	        while(i<arrLength){
//	            for(int j = i;j>=0;j--){
//	                arr[i]+=nums[i-j];
//	            }
//	            i++;
//	        }
//	        for (int a : arr) {
//				System.out.println(a);
//			}
//	        return arr;
		 
		 
		 int arrLength = nums.length;
		    for(int i=0;i<arrLength;i++){
	            if(i==0)
	                continue;
	            nums[i]+=nums[i-1];        
	        } 
		   
		   	
	        return nums;
	    }
	 //second one has less time complexity
     // explanation of this problem --> https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
}

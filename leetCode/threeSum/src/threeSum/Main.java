package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		  int[] nums = new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		  System.out.println(threeSum(nums)) ;
				  
	
	}
	 public static  List<List<Integer>> threeSum(int[] nums) {

	         List<List<Integer>> list = new ArrayList<>();
		     Arrays.sort(nums);
		     int first = 0;
		     int sum = 0;
		    
		     for(int i=0;i<nums.length;i++) {
		    	 first = i+1;
		    	 int last = nums.length-1;
		    	 while(last>first) {
		    		 sum = nums[last]+nums[i]+nums[first];
		    		 if(sum > 0) last--;
		    		 else if(sum < 0) first++;
		    		 else {
		    			 list.add(List.of(nums[last],nums[i],nums[first]));
		    			 int x = nums[last];
		    			 int y = nums[first];
		    			 while(last>first && x==nums[last])last--;
		    			 while(last>first && y == nums[first]) first++; 
		    		 }
			    	 }	  
		    	 while(i+1<nums.length && nums[i]==nums[i+1]) i++;//eğer bir sonraki ile aynı rakamsa atla
		     }
		    
		    
		     return list;
		 
	    }
	 
	 //Explanation of this problem --->>> https://leetcode.com/problems/3sum/

}

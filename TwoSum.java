
public class TwoSum {
	/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice. 


	####################Use hashmap. Only one pass.#############################*/
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        //Arrays.sort(nums);
	        int len=nums.length;
	        int a[]=new int[2];
	        for(int i=0;i<len-1;i++)
	        {
	            int diff=target-nums[i];
	           // System.out.println(nums[i]);
	            for(int j=i+1;j<len;j++)
	            {
	               int diff1=diff-nums[j];
	               // System.out.println(diff1);
	                if(diff1==0)
	                {
	                    a[0]=i;
	                    a[1]=j;
	                    return a;
	                }
	                //if(diff1<0)
	                   // break;
	                //diff=diff+nums[j];
	                //System.out.println(j);
	            }
	        }
	        return a;
	        
	    }
	}

}

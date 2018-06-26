
public class SumClosest {
	class Solution {
	    public int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        int c=nums.length;
	        int diff=9999;
	        int result=0;
	        for(int i=0;i<c-2;i++)
	        {
	            int j=i+1;
	            int k=c-1;
	            int sum;
	            while(j<k)
	            {
	                sum=nums[i]+nums[j]+nums[k];
	                //System.out.println(sum);
	                if(sum==target)
	                {
	                    result=sum;
	                    break;
	                }
	                else if(sum>target)
	                    k--;
	                else
	                    j++;
	                if(Math.abs(sum-target)<diff)
	                {
	                    diff=Math.abs(sum-target);
	                    result=sum;
	                }
	            }
	            if(result==target)
	            {
	                break;
	            }
	        }
	        return result;
	        
	    }
	}
}


public class LongestIncreasingSubsequence {

	class Solution {
	    public int lengthOfLIS(int[] nums) {
	        int len=nums.length;
	        if(len==0)
	            return 0;
	        int dp[]=new int[len];
	        Arrays.fill(dp,1);
	        boolean visited[]=new boolean[len];
	        Arrays.fill(visited,false);
	        int a;
	        for(int i=0;i<len;i++)
	        {
	            if(!visited[i])
	                a=Lis(nums,dp,i,len,visited);
	        }
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<len;i++)
	        {
	            if(dp[i]>max)
	                max=dp[i];
	        }
	        return max;
	        
	    }
	    public int Lis(int nums[],int dp[],int index,int len,boolean visited[])
	    {
	        if(index==len-1)
	        {
	            //System.out.println(index);
	            visited[index]=true;
	            return 1;
	        }
	        
	        
	        
	        
	        for(int i=index+1;i<len;i++)
	        {
	            if(visited[i])
	            {
	                dp[index]=Math.max(dp[index],dp[i]+1);
	            }
	            else
	            {
	                if(nums[i]>nums[index])
	                {
	                    //System.out.println("entered");
	                    dp[index]=Math.max(dp[index],Lis(nums,dp,i,len,visited)+1);
	                }
	            }
	        }
	        //System.out.println(dp[index]);
	        visited[index]=true;
	        return dp[index];
	    }
	}
}


public class SlidingWindowMaximum {
	class Solution {
	    public int[] maxSlidingWindow(int[] nums, int k) {
	        int len=nums.length;
	        if(len==0)
	            return new int[0];
	        int result[]=new int[len-k+1];
	        int i=0;
	        int max=Integer.MIN_VALUE;
	        int index=0;
	        int count=0;
	        ArrayList<Integer> al=new ArrayList();
	        while(i<k)
	        {
	            //System.out.println("hi");
	            if(nums[i]>max)
	            {
	                max=nums[i];
	                index=i;
	            }
	            i++;
	        }
	        result[count]=max;
	        al.add(index);
	        int start=1;
	        int end=k;
	        while(end<len)
	        {
	            if(al.get(count)>=start && al.get(count)<=end)
	            {
	                if(nums[end]>result[count])
	                {
	                    result[++count]=nums[end];
	                    al.add(end);
	                }
	                else
	                {
	                    result[++count]=result[count-1];
	                    al.add(al.get(count-1));
	                }
	            }
	            else
	            {
	                int a=end;
	                int max1=Integer.MIN_VALUE;
	                int index1=end;
	                while(a>=start)
	                {
	                    if(nums[a]>max1)
	                    {
	                        max1=nums[a];
	                        index1=a;
	                    }
	                    a--;
	                }
	                result[++count]=max1;
	                al.add(index1);
	            }
	            end++;
	            start++;
	        }
	        return result;
	        
	    }
	}

}

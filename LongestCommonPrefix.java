
public class LongestCommonPrefix {
	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        int min=9999;
	        int c=0;
	        if(strs.length==0)
	            return "";
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<strs.length;i++)
	        {
	            if(strs[i].length()<min)
	            {
	                min=strs[i].length();
	                c=i;
	            }
	        }
	        
	        for(int i=0;i<min;i++)
	        {
	            int j=0;
	            int ctr=0;
	            while(j<strs.length)
	            {
	                if(strs[c].charAt(i)!=strs[j].charAt(i))
	                {
	                    ctr=1;
	                    break;
	                }
	                j++;
	            }
	            if(ctr==0)
	            {
	                sb.append(strs[c].charAt(i));
	            }
	            else{
	                break;
	            }
	        }
	        return sb.toString();
	        
	    }
	}

}

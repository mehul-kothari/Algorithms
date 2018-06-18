
public class LongestSubstring {
	// usage of hashmap to keep record of characters since hashmap retrival time is O(1)


	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        
	        int len=s.length();
	        HashMap<Character,Integer> mp=new HashMap();
	        int curr=0;
	        int dist=0;
	        int max=0;
	        int max_temp=0;
	        for(int i=0;i<len;i++)
	        {
	            if(mp.containsKey(s.charAt(i)) && curr <=  mp.get(s.charAt(i)))
	            {
	                dist=i-curr;
	                curr=mp.get(s.charAt(i))+1;
	                max=Math.max(max,dist);
	                max_temp=-1;
	                
	            }
	            mp.put(s.charAt(i),i);
	            max_temp++;
	            max=Math.max(max_temp,max);
	            
	        }
	        return Math.max(max,len-curr);
	        
	    }
	}

}

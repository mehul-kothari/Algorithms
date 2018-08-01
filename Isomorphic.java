
public class Isomorphic {
	class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        int s_len=s.length();
	        int t_len=t.length();
	        HashMap<Character,Character> mp=new HashMap();
	        StringBuffer sb=new StringBuffer();
	        if(s_len!=t_len)
	            return false;
	        for(int i=0;i<s_len;i++)
	        {
	            if(mp.containsKey(s.charAt(i)))
	            {
	                sb.append(mp.get(s.charAt(i)));
	            }
	            else
	            {
	                if(mp.containsValue(t.charAt(i)))
	                    return false;
	                sb.append(t.charAt(i));
	                mp.put(s.charAt(i),t.charAt(i));
	            }
	            
	        }
	        return sb.toString().equals(t);
	        
	    }
	}
}

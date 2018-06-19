
public class StringToInteger {
	
	class Solution {
	    public int myAtoi(String str) {
	        str = str.trim();
	        int c=str.length();
	        char o='+';
	        if(c==0)
	        {
	            return 0;
	        }
	        int ctr=0;
	        StringBuffer sb=new StringBuffer();
	        if(str.charAt(0)==43 || str.charAt(0)==45)
	        {
	            o=str.charAt(0);
	            ctr++;
	        }
	        for(int i=ctr;i<c;i++)
	        {
	            if(str.charAt(i)>=48 && str.charAt(i)<=57 )
	            {
	                sb.append(str.charAt(i));
	            }
	            else
	            {
	                break;
	            }
	        }
	        if(sb.length()==0)
	        {
	            return 0;
	        }
	        else
	        {
	            double b = Double.parseDouble(sb.toString());
	            if(o=='-')
	                b=b*(-1);
	            if(b>Integer.MAX_VALUE)
	                return Integer.MAX_VALUE;
	            if(b<Integer.MIN_VALUE)
	                return Integer.MIN_VALUE;
	            return (int)b;
	        }
	        
	    }
	}

}

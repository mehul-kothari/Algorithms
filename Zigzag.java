
public class Zigzag {
	class Solution {
	    public String convert(String s, int numRows) {
	        
	        StringBuilder sb[]=new StringBuilder[numRows];
	        for(int i=0;i<numRows;i++)
	        {
	            sb[i]=new StringBuilder();
	        }
	        int n=s.length();
	        Boolean b1,b2;
	        int i=0;
	        while(i<n)
	        {
	            
	            int ctr=0;
	            while(ctr<numRows && i<n)
	            {
	                
	                sb[ctr].append(s.charAt(i));
	                ctr++;
	                i++;     
	            }
	            
	            ctr=numRows-2;
	            while(ctr>0 && i<n)
	            {
	                
	                sb[ctr].append(s.charAt(i));
	                ctr--;
	                i++;
	            }
	            
	            
	        }
	        StringBuilder sm=new StringBuilder();
	        for(i=0;i<numRows;i++)
	            sm.append(sb[i].toString());
	        
	        return sm.toString();
	        
	    }
	}

}

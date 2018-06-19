
public class ReverseInteger {
	
	// easy reversing technique just be careful about the edges


	class Solution {
	    public int reverse(int x) {
	        int sign=1;
	        if(x<0)
	        {
	            sign=-1;
	            x=x*sign;
	        }
	        int len=String.valueOf(x).length();
	        //System.out.println(len);
	       /* if(len==1)
	            return x;
	        if(len>10)
	            return 0;*/
	       if(len==10 && String.valueOf(x).charAt(len-1) -'0'>2)
	            return 0;
	        //System.out.println(len);
	        //int mul=(int)Math.pow(10,len-1);
	        int x1=x;
	        long rem=0;
	        int rem1=0;
	        while(x1>0 && rem<Integer.MAX_VALUE)
	        {
	            rem1=x1%10;
	            rem=rem1 + rem*10;
	            x1=x1/10;
	            
	        }
	        //System.out.println(rem);
	        if(rem>Integer.MAX_VALUE)
	            return 0;
	        return (int)rem*sign;
	        
	    }
	}

}

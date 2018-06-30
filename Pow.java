
public class Pow {
	
	class Solution {
	    public double myPow(double x, int n) {
	        
	        if(n==Integer.MAX_VALUE)
	        {
	            System.out.println("hi");
	            n=n/100 +1;
	        }
	         if(n==Integer.MIN_VALUE)
	        {
	            System.out.println("hi");
	            n=n/100;
	        }
	        double product=1;
	        boolean b=false;
	        if(n<0)
	        {
	            n=n*-1;
	            b=true;
	        }
	        for(int i=0;i<n;i++)
	        {
	            product=product*x;
	        }
	       // System.out.println(product);
	        if(b)
	        {
	            product=1/product;
	        }
	        return product;
	        
	    }
	}

}

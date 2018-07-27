
public class HappyNumber {
	
	class Solution {
	    public boolean isHappy(int n) {
	        List<Integer> al=new ArrayList();
	        int square=findSquare(n);
	        while(true)
	        {
	            if(square==1)
	                return true;
	            else
	            {
	                if(al.contains(square))
	                {
	                    return false;
	                }
	                else
	                {
	                    al.add(square);
	                    square=findSquare(square);
	                }
	            }
	        }
	        
	    }
	    public int findSquare(int n)
	    {
	        int sum=0;
	        int rem;
	        while(n!=0)
	        {
	            rem=n%10;
	            sum=sum+(rem*rem);
	            n=n/10;
	        }
	        return sum;
	    }
	}

}

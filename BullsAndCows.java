
public class BullsAndCows {

	class Solution {
	    public String getHint(String secret, String guess) {
	        int s_len=secret.length();
	       // int g_len=guess.length();
	        char s[]=secret.toCharArray();
	        char g[]=guess.toCharArray();
	        int bull=0;
	        int cow=0;
	        for(int i=0;i<s_len;i++)
	        {
	            if(secret.charAt(i)==guess.charAt(i))
	            {
	                bull++;
	                s[i]='b';
	                g[i]='b';
	            }
	            //System.out.println(s[i]);
	        }
	       for(int i=0;i<s_len;i++)
	       {
	           //System.out.println(i);
	           //System.out.println(s[i]);
	           if(g[i]!='b')
	           {
	              //System.out.println(g[i]);
	               int a=new String(s).indexOf(g[i]);
	               if(a!=-1)
	               {
	                   //System.out.println(a);
	                   cow++;
	                   s[a]='b';
	               }
	           }
	       }
	        //System.out.println(cow);
	        //System.out.println(bull);
	       // StringBuilder sb=new StringBuilder();
	        return bull + "A" + cow + "B";
	        //return "hello";
	    }
	}
}

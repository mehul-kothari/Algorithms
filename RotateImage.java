
public class RotateImage {
	class Solution {
	    public void rotate(int[][] matrix) {
	        int start=0;
	        int n=matrix.length;
	        int dec;
	        if(n==2)
	            dec=2;
	        else
	            dec=n-2;
	        int a[][]=matrix;
	        //count=0;
	        while(start<dec)
	        {
	            for(int i=start;i<n-start-1;i++)
	            {
	                int temp=a[i][n-start-1];
	                a[i][n-start-1]=a[start][i];
	                //System.out.println(a[i][n-start-1]);
	                int temp1=a[n-1-start][n-i-1];
	                a[n-1-start][n-i-1]=temp;
	               int temp2=a[n-i-1][start];
	                a[n-i-1][start]=temp1;
	                int temp3=a[start][i];
	                a[start][i]=temp2;
	            }
	           /* for(int j=0;j<n;j++)
	            {
	                for(int k=0;k<n;k++)
	                {
	                    //System.out.println(a[j][k]);
	                }
	            }*/
	            start++;
	        }
	        
	    }
	}

}
